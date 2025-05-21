package Ese32;

import java.util.HashMap;

public class Ese32 {
    
    public static void main(String[] args) {
        
        if(args.length<2){
            System.out.println("Inserisci username e password come argomenti");
            return;
        }


        //l'esercizio richiedeva che i username e pssw fossero inseriti da terminale e non da tastiera
        String inputUsername=args[0];
        String inputPassword=args[1];

        HashMap<String ,String> utenti = new HashMap<>();

        utenti.put("matteo","1234");
        utenti.put("pietro","12345");
        utenti.put("andrea","123456");
        
        if(utenti.containsKey(inputUsername)){ //check username
            String passCorretta = utenti.get(inputUsername);
            if(passCorretta.equals(inputPassword)){ //check password 
                System.out.println("Benvenuto....");
            }else{
                System.out.println("passoword errata");
            }
        }else{
            System.out.println("username non esiste");
        }
    }
}
