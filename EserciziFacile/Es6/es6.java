package Es6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class es6 {
    
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<studente> studenti = new ArrayList<studente>();

        try{
            System.out.println("quanti studenti vuoi inserire?");
            int Nstudenti = Integer.parseInt(input.readLine());
            

            for (int i=0;i <Nstudenti; i++){
                System.out.println("\n Studente "+(i+1));
                System.out.println("nome: ");
                String nome= input.readLine();

                System.out.println("matricola: ");
                String matricola= input.readLine();

                ArrayList<Integer> listavoti = new ArrayList<Integer>();
                System.out.println("inserisci uno ad uno i voti (doppio invio per finire)");

                while(true){

                    String in = input.readLine();
                    if(in == null || in.trim().isEmpty()){
                        break;
                    }
                    try {
                        int voto = Integer.parseInt(in);
                        listavoti.add(voto);
                    }catch(NumberFormatException e ){
                        System.out.println("inserire un voto valido o una riga vuota per terminare");
                    }
                }

                int[] votiArray = listavoti.stream().mapToInt(Integer::intValue).toArray();
                studente students = new studente(nome, matricola, votiArray);
                studenti.add(students);
            }

            System.out.println("\n Media voti per ogni studente: ");
            for(studente x : studenti){
                System.out.println(x.getNome()+ " (" + x.getMAtricola() + ") ha la Media: " + x.calcolamedia());
            }


        }catch (IOException e){
            System.err.println(e);
        }
    }
}
