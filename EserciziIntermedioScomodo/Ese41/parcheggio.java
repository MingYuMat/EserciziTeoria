package Ese41;
import java.util.Scanner;

public class parcheggio {

    public static void mostraParcheggio(boolean[] posti){
        System.out.println("Stato parcheggio: ");
        for(int i=0; i<posti.length;i++){
            //lavorando con i boolean io non avro numeri dentor all'array ma sono si o no
            System.out.println("["+(posti[i] ? "x" : " ")+"]");
        }
        System.out.println();
    }
    

    public static void ingressoAuto(boolean[] posti,Scanner scanner){
        
        System.out.println("inserisci il numero del parcheggio");
        int numero = scanner.nextInt();

        if(numero < 1 || numero > 10){
            System.out.println("i posti vanno da 1 a 10");
        }
        
        //numero-1 perche array è 0-9 
        if(!posti[numero-1]){
            posti[numero-1]=true ; // true vuol dire occupato
            System.out.println("Auto parcheggiata nel posto"+numero);
        }else {
            System.out.println("il posto "+numero+" è gia occupato");
        }
    }

    public static void uscitaAuto(boolean[] posti,Scanner scanner){
        
        System.out.println("Inserisci il numero del parcheggio");
        int numero = scanner.nextInt();

        if(numero<1 || numero > 10 ){
            System.out.println("i posti vanno da 1 a 10");
            return;
        }

        //se il posto è occupato 
        if(posti[numero-1]){
            posti[numero-1]=false; //false vuol dire vuoto
            System.out.println("il posto "+numero+" si sta liberando");
        }else{
            System.out.println("il posto "+numero+" è gia libero");
        }
    }
    
}
