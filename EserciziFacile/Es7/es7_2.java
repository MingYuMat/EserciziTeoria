//ho pensato che avere generare una limitazione nella dimensione dell'array potesse creare problemi
package Es7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class es7_2 {

    public static void main(String[] args) {
        

        try{

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<Integer> lista = new ArrayList<Integer>();

            System.out.println("inserisci i numeri(Stop per terminare)");

            while(true){
                System.out.println("numero: ");
                String in = input.readLine();

                if(in.equalsIgnoreCase("stop")){
                    break;
                }

                int num=Integer.parseInt(in);
                lista.add(num);
            }
            if (lista.isEmpty()) {
            System.out.println("Nessun numero inserito.");
            }else{
                    System.out.println("Numeri pari inseriti sono: ");
                    for(int n : lista){
                        if(n%2 ==0){
                            System.out.println(n);
                        }
                    }
                }

        }catch(IOException e){
            System.err.println(e);
        }


    }
    
}
