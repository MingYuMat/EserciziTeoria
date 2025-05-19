package Ese35;

public class nazionale extends squadra implements Comparable<nazionale>{

    public int punti;

    public nazionale(String nome,int punti){
        super(nome);
        this.punti=punti;
    }

    public int getPunti(){
        return punti;
    }

    public int compareTo(nazionale altra){
        return Integer.compare(altra.punti, this.punti);
    }

    public String toString(){
        return nome+" - "+punti+" punti";
    }
    
}
