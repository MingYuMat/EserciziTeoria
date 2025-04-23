package Es3;

public class Contatto{
    private String nome;
    private String numero;

    public Contatto(String nome,String numero){
        this.nome=nome;
        this.numero=numero;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNumero(String numero){
        return numero;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }

    public void StampaContatto(){
        System.out.println("Nome:"+ nome + "; Telefono: "+ numero );
    }
}
