package Ese23;

public class film {
    
    private String titolo ;
    private sala Nsala;
    
    public film(String titolo,sala Nsala){
        this.titolo=titolo;
        this.Nsala=Nsala;
    }

    public String getTitolo(){
        return titolo;
    }

    public sala getSala(){
        return Nsala;
    }
}
