package Esercizio1;

public class Moto extends MezzoDiTrasporto{

    public Moto(String Targa){
        super(Targa);
    }

    public void avvia(){
        System.out.println("auto con targa" + getTarga()+ "avviata");
    }

    public void ferma(){
        System.out.println("auto con targa" + getTarga()+ "fermata");
    }

    public String getTipo(){
        return "moto";
    }
}
