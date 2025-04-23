package Esercizio1; 


public abstract class MezzoDiTrasporto implements Veicolo {
     
    private String Targa ; 

    public MezzoDiTrasporto(String Targa){ //costruttore 
        this.Targa = Targa ;
    }

    public String getTarga(){
        return Targa;
    }

    public abstract void avvia();
    public abstract void ferma();
    public abstract String getTipo();
}