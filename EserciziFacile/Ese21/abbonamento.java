package Ese21;


public class abbonamento implements paga {

    private String nome;
    private double costoMensile;
    private int mesi;

    public abbonamento(String nome,double costoMensile,int mesi){
        this.nome=nome;
        this.costoMensile=costoMensile;
        this.mesi=mesi;
    }
    

    @Override
    public double calcolaTotale(){
        return costoMensile*mesi;
    }

    @Override
    public String toString(){
        return "abbonamento- "+nome+": euro "+calcolaTotale();
    }
}
