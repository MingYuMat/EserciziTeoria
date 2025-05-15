package Ese29;

public class alimentare extends prodotto{
    
    private String dataScadenza;
    
    public alimentare(String nome,double prezzo,String dataScadenza){
        super(nome,prezzo);
        this.dataScadenza=dataScadenza;
    }

    public void stampaDettagli(){
        super.stampaDettagli();
        System.out.println("-> data di scadenza: "+dataScadenza);
    }
}
