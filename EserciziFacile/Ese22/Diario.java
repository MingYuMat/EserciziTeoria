package Ese22;

import java.time.LocalDate;

public class Diario {

    private String testo;
    private LocalDate data ;

    public Diario(String testo,LocalDate data){
        this.testo=testo;
        this.data=data;
    }

    public LocalDate getData(){
        return data;
    }

    public String getTesto(){
        return testo;
    }

    @Override 
    public String toString(){
        return data+" - "+testo;
    }
    
}
