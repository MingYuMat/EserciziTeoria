package Ese13;

public class Prodotto {
    
    private String name;
    private String codice;
    private double prezzo;

    public Prodotto(String nome,String codice,double prezzo){
        this.name=nome;
        this.codice=codice;
        this.prezzo=prezzo;
    }

    public String getNome(){
        return name;
    }

    public String getCodice(){
        return codice;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public String toString(){
        return "Il prodotto "+name+ ",con codice "+codice+" ha prezzo "+prezzo;
    }
}
