package Es2;


public class manager  extends dipendente implements pagabile,lavoratore {

    private String mobile;

    public manager(String nome,String mobile){
        super(nome);
        this.mobile=mobile;
    }

    @Override
    public void lavora() {
        System.out.println("Il manager " + nome + " sta lavorando.");
    }

    @Override
    public double calcolaPaga(){
        System.out.println("Il manager " + nome + " sta calcolando la paga.");
        return 3000;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMobile(){
        return this.mobile;
    }

    public void setMobile(String mobile){
        this.mobile=mobile;
    }

    
}
