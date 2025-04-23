package Es2;

public class sviluppatore extends dipendente implements lavoratore,pagabile {

    private String matricola;

    public sviluppatore(String nome,String matricola){
        super(nome);
        this.matricola=matricola;
    }

    @Override
    public void lavora() {
        System.out.println("Lo sviluppatore " + matricola + " sta lavorando.");
    }

    @Override
    public double calcolaPaga(){
        System.out.println("Lo sviluppatore " + nome + " sta calcolando la paga.");
        return 2000;
    }

    @Override
    public String getNome(){
        return nome;
    }
}