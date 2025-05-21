package Ese41;
import java.util.InputMismatchException;
import java.util.Scanner;

public class parcheggio {

    //uso metodi static in modo tale da non dover andare a generare istanze nel main
    public static void mostraParcheggio(boolean[] posti){
        System.out.println("Stato parcheggio: ");
        for(int i=0; i<posti.length;i++){
            //lavorando con i boolean io non avro numeri dentor all'array ma sono si o no
            System.out.println("["+(posti[i] ? "x" : " ")+"]"); 
            //stampo una griglia dove se il posto è occupato è [X] se vuoto è [ ] 
        }
        System.out.println();
    }
    
    //essendo boolean i posti sono true per occupati(true = [X]) e false per vuoti(false=[ ])
    public static void ingressoAuto(boolean[] posti,Scanner scanner){
        
        System.out.println("inserisci il numero del parcheggio");

        try{
            int numero = scanner.nextInt();

            if(numero < 1 || numero > posti.length){
                System.out.println("i posti vanno da 1 a "+posti.length);
                return ;
            }
            
            //numero-1 perche array è 0-lenght non 1
            if(!posti[numero-1]){ //se non è true (cioè occupato)
                posti[numero-1]=true ; // true vuol dire occupato
                System.out.println("Auto parcheggiata nel posto"+numero);
            }else {
                System.out.println("il posto "+numero+" è gia occupato");
            }
        }catch(InputMismatchException e){
            System.out.println("Errore ");
            scanner.nextLine();
        }
    }

    public static void uscitaAuto(boolean[] posti,Scanner scanner){
        
        System.out.println("Inserisci il numero del parcheggio");

        try{
            int numero = scanner.nextInt();

            if(numero<1 || numero > posti.length ){
                System.out.println("i posti vanno da 1 a " +posti.length);
                return;
            }

            //se il posto è occupato 
            if(posti[numero-1]){
                posti[numero-1]=false; //false vuol dire vuoto
                System.out.println("il posto "+numero+" si sta liberando");
            }else{
                System.out.println("il posto "+numero+" è gia libero");
            }
        }catch(InputMismatchException e){
            System.out.println("errore");
            scanner.nextLine();
        }
    }
    
}
