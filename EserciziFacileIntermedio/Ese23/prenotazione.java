package Ese23;

public class prenotazione {
    
    private String nome;
    private film nomefilm;
    private sala Sala;

    public prenotazione(String nome,film nomefilm,sala Sala){
        this.nome=nome;
        this.nomefilm=nomefilm;
        this.Sala=Sala;
    }

    @Override
    public String toString(){
        return "Lo Spettatore "+nome+" sta guardando il film "+nomefilm.getTitolo() +" nella sala "+ Sala.getNumeroSala();
    }
}
