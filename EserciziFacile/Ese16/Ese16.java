package Ese16;

import java.util.ArrayList;

public class Ese16 {

    public static void main(String[] args){

        if(args.length == 0){
            System.out.println("devi metterci delle parole nella riga di comando ");
            return ;
        }

        ArrayList<String> parole = new ArrayList<>();
        int contatore = 0;

        for (String parola : args){
            if(parola.length() > 5){
                parole.add(parola);
                contatore++;
            }
        }

        System.out.println("le parole con piu di 5 lettere sono: ");
        for (String x : parole){
            System.out.println(x);
        }

        System.out.println("\n il numero di parole lunghe è "+contatore);
    }
    
}
