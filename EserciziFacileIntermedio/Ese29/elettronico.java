package Ese29;

public class elettronico extends prodotto{

    private int garanziaMesi;

    public elettronico(String nome,double prezzo,int garanziaMesi){
        super(nome, prezzo);
        this.garanziaMesi=garanziaMesi;
    }

    public void stampaDettagli(){
        super.stampaDettagli();
        System.out.println("->Garanzia: "+garanziaMesi+" mesi");
    }
}
