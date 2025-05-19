package Ese35;

import java.util.ArrayList;

import java.util.Collections;


public class Ese35 {
    
    public static void main(String[] args) {
        
        ArrayList<nazionale> classifica = new ArrayList<>();

        classifica.add(new nazionale("juve", 70));
        classifica.add(new nazionale("bologna", 75));
        classifica.add(new nazionale("milan", 80));
        classifica.add(new nazionale("interMERDA", 71));

        Collections.sort(classifica);

        System.out.println("--Classifica finale");
        int posizione =1;
        for(nazionale x : classifica){
            System.out.println(posizione+". "+x);
            posizione++;
        }
    }
}
