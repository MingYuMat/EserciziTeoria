package Es10;

public class squadra {

    private String nome;
    private int punti;

    public squadra(String nome,int punti){
        this.nome=nome;
        this.punti=punti;
    }

    public String getNome(){
        return nome;
    }

    public int getPunti(){
        return punti;
    }

    public String risultato(){
        return nome + " - " + punti + " punti ";
    }
    
}
