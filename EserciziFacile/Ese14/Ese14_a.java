package Ese14;

import java.util.ArrayList;

public class Ese14_a {

    public static void main(String[] args) {
        
        ArrayList<studente> studenti = new ArrayList<studente>();

        studenti.add(new studente("gianni",new int[]{1,1,1,1,0}));
        studenti.add(new studente("giulio", new int[]{1,1,1,0,0}));
        studenti.add(new studente("marco", new int[]{1,1,0,0,0}));

        System.out.println("presenze settimanali: ");
        for (studente s : studenti ){
            System.out.println(s.getNome() +": "+ s.getTotPresenze()+" presenze");
        }
    }
    
}
