package Ese29;

import java.util.ArrayList;

public class ese29 {
    
    public static void main(String[] args) {
        
        ArrayList<prodotto> magazzino = new ArrayList<prodotto>();

        magazzino.add(new alimentare("sugo ", 3.0, "2025-01-01"));
        magazzino.add(new elettronico("telefono", 1500.00, 24));

        System.out.println("I prodotti alimentari sono:");
        for(prodotto x: magazzino){
            if(x instanceof alimentare){
                x.stampaDettagli();
            }
        }

        
        System.out.println("I prodotti elettronici sono:");
        for(prodotto y: magazzino){
            if(y instanceof elettronico){
                y.stampaDettagli();
            }
        }
    }
}
