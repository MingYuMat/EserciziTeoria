package Ese29;

public class prodotto {
    
    protected String nome;
    protected double prezzo;

    public prodotto(String nome,double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public void stampaDettagli(){
        System.out.println("Nome: "+nome+", Prezzo: "+prezzo);
    }
}
