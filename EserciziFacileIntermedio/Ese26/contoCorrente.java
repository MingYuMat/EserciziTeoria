package Ese26;

public class contoCorrente extends conto {

    public contoCorrente(String intestatario,double saldo){
        super(intestatario, saldo);
    }

    public double calcolaInteresse(){
        return saldo*0.01;
    }
}