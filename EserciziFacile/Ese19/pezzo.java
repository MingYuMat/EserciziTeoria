package Ese19;

public class pezzo {

    private String nome;

    public pezzo(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return String.format("%-12s", nome);
    }

    //per far si che i nomi dei pezzi non strabordino , formatto una stringa in uno spazio maggiore

    
}
