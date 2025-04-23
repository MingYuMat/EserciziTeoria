package Es4;

import java.util.ArrayList;
import java.util.Collections;

public class Es4 {

    public static void main(String[] argc){

        ArrayList<squadra> classifica = new ArrayList<squadra>();

        classifica.add(new squadra("tiger",42));
        classifica.add(new squadra("lione",33));

        Collections.sort(classifica);

        for(squadra q : classifica){
            System.out.println(q);
        }
    }
    
}
