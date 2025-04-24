package Ese17;

public class libro {

    private String titolo;
    private String autore;
    private int anno;

    public libro(String titolo,String autore,int anno){
        this.titolo=titolo;
        this.autore=autore;
        this.anno=anno;
    }


    public String getTitolo(){
        return titolo;
    }

    public String getAutore(){
        return autore;
    }

    public int getAnno(){
        return anno;
    }

    public void stampaInfo(){
        System.out.println("titolo: "+ titolo +" pubblicato da "+autore +" nel "+ anno);
    }
    
}
