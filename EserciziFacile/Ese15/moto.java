package Ese15;

public class moto extends macchina{

    public moto(String modello){ //estendedno la classe posso utilizzare il costruttore base
        super(modello);
    }

    public void avvia(){
        System.out.println("la moto "+modello+" è stata avviata");
    }
    
}
