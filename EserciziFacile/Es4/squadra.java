package Es4;

public class squadra implements Comparable<squadra>{

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

    @Override
    public int compareTo(squadra altra){
        return Integer.compare(altra.punti, this.punti);
    }
}
