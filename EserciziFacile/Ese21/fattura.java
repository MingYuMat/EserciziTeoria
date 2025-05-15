package Ese21;

public class fattura implements paga {

    private String descrizione;
    private int quantita;
    private double prezzoUnitario;

    public fattura(String descrizione,int quantita,double prezzoUnitario){
        this.descrizione=descrizione;
        this.quantita=quantita;
        this.prezzoUnitario=prezzoUnitario;
    }

    @Override
    public double calcolaTotale(){
        return quantita * prezzoUnitario;
    }

    @Override
    public String toString(){
        return "il valore della Fattura  "+ descrizione +" è: "+ calcolaTotale();
    }
    
}
