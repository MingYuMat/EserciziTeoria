package Es8;

import java.util.ArrayList;



public class Es8 {

    public static void main(String[] args) {
            

        ArrayList<Animale> animali = new ArrayList<>();

        animali.add(new Cane());
        animali.add(new Gatto());
        animali.add(new Cane());
        animali.add(new Cane());

        for (Animale x : animali){
            x.verso();
        }


        
    }
    
}
