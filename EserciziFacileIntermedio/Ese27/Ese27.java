package Ese27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ese27 {
    
    public static void main(String[] args) {
        
        String input = "/home/matteo/Software/EserciziTeoria/EserciziFacileIntermedio/Ese27/studenti.txt";
        String output = "/home/matteo/Software/EserciziTeoria/EserciziFacileIntermedio/Ese27/media.txt";

        ArrayList<studente> studenti = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(input))){ //leggo dal file
            String line;
            while((line = br.readLine())!= null){ //prendo una riga del file 
                String[] parti = line.split(","); //suddivo la riga in base alle virgole
                if(parti.length ==2){  // se la riga è divisa in due parti 
                    String nome= parti[0].trim(); //rimuovo possibili spazi
                    int voto = Integer.parseInt(parti[1].trim());
                    studenti.add(new studente(nome,voto)); //uso i valori per creare un oggetto studente
                }
            }
        }catch(IOException e ){
            System.err.println("Errore" +e.getMessage());
            return ;
        }

        double somma=0;
        for (studente x : studenti){
            somma += x.getVoto();
        }
        double media = studenti.isEmpty() ? 0: somma/studenti.size(); //se vuoto do zero , se no faccio media

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(output)) ){ //scrivo sul file di output
            bw.write(String.format("media voti:%.2f",media)); //format con decimali 
            System.out.println("media calcolata e salvata su "+ output );
        }catch (IOException e ){
            System.err.println("errore nella scrittura del file");
        }
    }
}
