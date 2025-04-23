package Es2;

public abstract class dipendente {
    
    protected String nome;

    public dipendente(String nome) {
        this.nome = nome;
    }

    public abstract String getNome();   
}
