package Ese28;

public class persona {
    
    private String nome;
    private int eta;

    public persona(String nome,int eta){
        this.nome=nome;
        this.eta=eta;
    }

        @Override
    public String toString(){
        return "nome: "+nome+", Eta: "+eta;
    }
}
