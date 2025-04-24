package Ese15;

public abstract class macchina {

    protected String modello;

    public macchina(String modello){
        this.modello=modello;
    }

    public void info(){
        System.out.println("modello: "+modello);
    }

    public abstract void avvia();
    
}
