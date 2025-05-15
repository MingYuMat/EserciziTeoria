package Ese28;

import java.util.HashMap;
import java.util.Map;

public class ese28 {
    public static void main(String[] args) {
        
        if(args.length ==0){
            System.out.println("Bisogna inserire una linea json come argomento");
            System.out.println("come ad esempio{\"nome\":\"Luca\",\"eta\":22}");
            return;
        }

        String json = args[0];

        json=json.trim();

        if(json.startsWith("{")&&json.endsWith("}")){
            json=json.substring(1, json.length()-1);
        }else{
            System.out.println("hai sbagliato il formato del json");
            return;
        }

        String[] coppia= json.split(",");

        Map<String,String> mappa = new HashMap<>();

        for(String x : coppia ){
            String[] parti = x.split(":");

            if(parti.length==2){
                String chiave=parti[0].replaceAll("[\"\\s]", "");
                String valore = parti[1].replaceAll("[\"\\s]", "");
                mappa.put(chiave,valore);
            }
        }

        String nome=mappa.get("nome");
        int eta= Integer.parseInt(mappa.get("eta"));

        persona p = new persona(nome, eta);
        System.out.println("Oggetto creato ");
        System.out.println(p);


    }
}
