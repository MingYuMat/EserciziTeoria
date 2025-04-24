package Ese17;

import java.util.ArrayList;

public class Ese17 {

    public static void main(String[] args) {
        
        
        ArrayList<libro> biblioteca = new ArrayList<libro>();

        biblioteca.add(new libro("OnePiece","oda",1999));
        biblioteca.add(new libro("divina commedia","dante",1400));
        biblioteca.add(new libro("1984", "Orwell", 1900));

        System.out.println("Elenco dei libri in biblioteca");
        for(libro x : biblioteca){
            x.stampaInfo();
        }
    }
}
