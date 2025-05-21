package Ese14;

public class studente {

    private String nome;
    private int[] presenze;
    
    public studente(String nome,int[] presenze){
        this.nome=nome;
        this.presenze=presenze;
    }

    public String getNome(){
        return nome;
    }

    public int getTotPresenze(){
        int totale=0;
        for(int giorno : presenze){
            totale += giorno; //presente 1 assente 0 
        }
        return totale;
    }
}
