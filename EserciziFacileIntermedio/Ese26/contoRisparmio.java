package Ese26;

public class contoRisparmio extends conto{
    
    public contoRisparmio(String intestatario,double conto){
        super(intestatario, conto);
    }

    public double calcolaInteresse(){
        return saldo*0.03;
    }
}
