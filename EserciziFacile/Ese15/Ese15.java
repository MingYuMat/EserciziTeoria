package Ese15;

import java.util.ArrayList;

public class Ese15 {

    public static void main(String[] args) {
        
        ArrayList<macchina> veicolo = new ArrayList<macchina>();

        veicolo.add(new auto("fiat"));
        veicolo.add(new moto("honda"));
        veicolo.add(new auto("ferrari"));
        veicolo.add(new moto("kawasaki"));


        for(macchina x : veicolo){ //in base al tipo di veicolo la funzione info e avvia agirà differentemente 
            x.info();
            x.avvia();
            System.out.println();
        }
    }
    
}
