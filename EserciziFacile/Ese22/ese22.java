package Ese22;

import java.time.LocalDate;
import java.util.ArrayList;

public class ese22 {
    
    public static void main(String[] args) {
        
        ArrayList<Diario> diario= new ArrayList<Diario>();

        diario.add(new Diario("odio java", LocalDate.now()));
        diario.add(new Diario("qua piovee", LocalDate.now().minusDays(5)));
        diario.add(new Diario("30 in Software", LocalDate.now().minusDays(10)));
        diario.add(new Diario("iniziamo il progetto", LocalDate.now().minusMonths(1)));

        LocalDate settegiornifa = LocalDate.now().minusDays(7);

        System.out.println("Le voci negli ultimi 7 giorni: ");
        for(Diario x : diario){
            if(x.getData().isAfter(settegiornifa)|| x.getData().isEqual(settegiornifa)){
                System.out.println(x);
            }
        }
    }
}
