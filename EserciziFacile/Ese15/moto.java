package Ese15;

public class moto extends macchina{

    public moto(String modello){
        super(modello);
    }

    public void avvia(){
        System.out.println("la moto "+modello+" è stata avviata");
    }
    
}
