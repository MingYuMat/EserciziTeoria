package Es7;

import java.io.*;

public class es7 {
    
    public static void main (String[] argc){

        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("quanti numeri vuoi inserire?");
            int n = Integer.parseInt(input.readLine());

            int[] numeri = new int[n];

            for(int i=0;i<n;i++){ //ciclo di inserimento dei valori in ogni casella dell'array 
                System.out.println("inserisci il numero " + (i+1) + ": ");
                numeri[i]=Integer.parseInt(input.readLine());
            }

            System.out.println("I numeri pari inseriti sono: "); 
            for(int j=0;j<n;j++){ //ciclo dell'array per controllare quali siano i valori positivi e stamparli 
                if(numeri[j]%2 == 0){
                    System.out.println(numeri[j]);
                }
            }
        }catch(IOException e ){
            System.out.println(e);
        }
    }
}
