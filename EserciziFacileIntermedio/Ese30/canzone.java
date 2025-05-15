package Ese30;

import java.util.ArrayList;

public class canzone{
    private String titolo;
    private String artista;
    private int durata;

    public canzone(String titolo,String artista,int durata){
        this.titolo=titolo;
        this.artista=artista;
        this.durata=durata;
    }

    public int getDurata(){
        return durata;
    }

    public void stampaDettagli(){
        System.out.println(titolo+" - "+artista+" ("+durata+")");
    }

    public static int calcolaDurataTotale(ArrayList<canzone> playlist){
        int totale = 0;

        for(canzone x : playlist){
            totale+=x.getDurata();
        }
        return totale ;
    }
}