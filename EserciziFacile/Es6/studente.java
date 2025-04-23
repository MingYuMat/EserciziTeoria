package Es6;

public class studente {

    private String nome;
    private String matricola;
    private int[] voti;

    public studente(String nome,String matricola,int[] voti){
        this.nome=nome;
        this.matricola=matricola;
        this.voti=voti;
    }

    public double calcolamedia(){
        if(voti.length == 0 ) return 0.0;

        int somma=0;
        for (int voto : voti){
            somma += voto;
        }

        return (double) somma/voti.length;
    }

    public String getNome(){
        return nome;
    }

    public String getMAtricola(){
        return matricola;
    }
    
}
