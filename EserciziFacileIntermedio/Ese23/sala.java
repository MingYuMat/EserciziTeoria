package Ese23;

import java.util.ArrayList;

public class sala {
    
    private int numeroSala;
    private int postiTot;
    private ArrayList<prenotazione> prenotazioni;

    public sala(int numeroSala,int postiTot){
        this.numeroSala=numeroSala;
        this.postiTot=postiTot;
        this.prenotazioni= new ArrayList<>();
    }

    public int getPostiLiberi(){
        return postiTot-prenotazioni.size();
    }

    public boolean prenotaPosto(String nomespettaore , film nomeFilm){
        if(prenotazioni.size()<postiTot){
            prenotazioni.add(new prenotazione(nomespettaore,nomeFilm,this)); //il this rappresenta la sala 
            return true ;
        } else {
            return false ;
        }

    }

    public void mostraPrenotazione(){
        for (prenotazione x : prenotazioni){
            System.out.println(x);
        }
    }

    public int getNumeroSala(){
        return numeroSala;
    }


}
