package Ese31;

public class contatto {

    private String nome;
    private String numero;
    private String email;

    public contatto(String nome,String numero,String email){
        this.nome=nome;
        this.numero=numero;
        this.email=email;
    }


    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public void stampa(){
        System.out.println(nome+" - "+numero+" - "+email);
    }
    
}
