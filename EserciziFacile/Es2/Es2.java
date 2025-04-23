package Es2;

import java.util.ArrayList;

public class Es2{
    
    public static void main(String[] args){

       
        ArrayList<sviluppatore> sviluppatores = new ArrayList<sviluppatore>();

        for (int i = 0; i < 10;i++){
            sviluppatores.add(new sviluppatore("Sviluppatore" + i, "Matricola" + i));
        }

        manager m = new manager("Manager", "mobile");

        for (sviluppatore sviluppatore : sviluppatores){
            sviluppatore.calcolaPaga();
        }

        m.calcolaPaga();

    }
}