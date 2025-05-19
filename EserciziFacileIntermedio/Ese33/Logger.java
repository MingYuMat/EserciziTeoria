package Ese33;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Logger {

    private static Logger istanza = null;

    private static final String LOG_FIlE = "Ese33/log.txt";

    private FileWriter writer;
    private DateTimeFormatter formatter;

    private Logger(){
        try{
            writer = new FileWriter(LOG_FIlE,true);
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        }catch(IOException e){
            System.out.println("Errore nell'apertura log ");
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if(istanza ==null){
            istanza = new Logger();
        }
        return istanza;
    }

    public void log(String messaggio){
        try{
            String timestamp = LocalDateTime.now().format(formatter);
            writer.write("{"+timestamp+"}"+messaggio+"\n");
            writer.flush();
        }catch(IOException e){
            System.out.println("Errore nella scirttura del log");
        }
    }

    public void chiudi(){
        try {
            if (writer != null){
                writer.close();
            }
        }catch(IOException e){
            System.out.println("errore chiusura log");
        }
    }


    
}
