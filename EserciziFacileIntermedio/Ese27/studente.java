package Ese27;

public class studente{
    private String nome;
    private int voto;

    public studente(String nome,int voto){
        this.nome=nome;
        this.voto=voto;
    }

    public int getVoto(){
        return voto;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return nome+": "+voto;
    }


}