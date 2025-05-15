package Ese30;

import java.util.ArrayList;

public class Ese30{

    public static void main(String[] args) {
        ArrayList<canzone> playList = new ArrayList<>();

        playList.add(new canzone("papaute","matteo",354));
        playList.add(new canzone("hanno ucciso luomo ragno","matteo",400));
        playList.add(new canzone("ave maria", "gesu", 500));
    
        System.out.println("la playlist");
        for(canzone x : playList){
            x.stampaDettagli();
        }

        int durataTot= canzone.calcolaDurataTotale(playList);
        System.out.println("\n la durata totale della playlist è "+durataTot+" secoondi");

        int minuti= durataTot/60 ;
        int secondi = durataTot % 60 ;

        System.out.println("Ecco qua: "+minuti+" min e "+secondi);
    
    }
}