package Ese15;

public class auto extends macchina{

    public auto(String modello){ //idem
        super(modello);
    }

    @Override
    public void avvia(){
        System.out.println("la macchina "+ modello +" è stata avviata");
    }
}