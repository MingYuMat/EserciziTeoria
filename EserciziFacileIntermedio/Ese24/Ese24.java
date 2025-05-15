package Ese24;

import java.util.ArrayList;

public class Ese24 {
    
    public static void main(String[] args) {
        
        ArrayList<spendibile> ordine = new ArrayList<>();

        ordine.add(new ordineOnline("ON123"));
        ordine.add(new ordineNegozio("NT123"));

        for(spendibile x : ordine){
            System.out.println(x.spedizione());
        }
    }
}
