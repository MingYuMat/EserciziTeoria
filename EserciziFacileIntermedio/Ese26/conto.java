package Ese26;

public abstract class conto {
    
    protected String intestatario;
    protected double saldo;

    public conto(String intestatario,double saldo){
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public abstract double calcolaInteresse();

    public String getInventario(){
        return intestatario;
    }

    public double getSaldo(){
        return saldo;
    }

    public String toString(){
        return intestatario+" - Saldo: $" + saldo;
    }
}
