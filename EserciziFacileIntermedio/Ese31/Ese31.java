package Ese31;

import java.util.ArrayList;
import java.util.Scanner;

public class Ese31 {
    
    public static void main(String[] args) {
        ArrayList<contatto> rubrica= new ArrayList<>();

        Scanner input = new Scanner(System.in);

        rubrica.add(new contatto("matteo tucci", "333 3333333", "bho@gmail.com"));
        rubrica.add(new contatto("matteo ucci", "444 4444444", "bah@gmail.com"));

        System.out.println("...Esecuzione ricerca nella rubbrica");
        System.out.println("1.Cerca nome contatto");
        System.out.println("2.Cerca email contatto");

        int scelta = input.nextInt();

        input.nextLine();

        if(scelta==1){
            System.out.println("inserisci parte del nome");
            String filtro = input.nextLine().toLowerCase();

            System.out.println("risultati trovati");
            for(contatto x : rubrica){ //se il mio contatto contiene il nome che ho scritto lo stampa
                if(x.getNome().toLowerCase().contains(filtro)){
                    x.stampa();
                }
            }
        }else if(scelta ==2){
            System.err.println("inserisci il dominio della mail");
            String dominio = input.nextLine().toLowerCase();


            System.out.println("risultati trovati");
            for(contatto y : rubrica){
                if(y.getEmail().toLowerCase().endsWith("@"+dominio)){ //se continee @gmail.com lo stampa
                    y.stampa();
                }
            }
        }else{
            System.out.println("errore");
        }

        input.close();
    }
}
