package Ese41;

import java.util.Scanner;

public class Ese41{

    public static void main(String[] args){

        boolean[] posti = new boolean[10];
        Scanner scanner = new Scanner(System.in);

        int scelta;

        do{
            System.out.println("\n -- Parcheggio --");
            parcheggio.mostraParcheggio(posti);

            System.out.println("\n1. Ingresso auto");
            System.out.println("2. Uscita auto");
            System.out.println("3. Esci");
            System.out.println("scelta: ");

            scelta = scanner.nextInt();

            switch (scelta){
                case 1 :
                    parcheggio.ingressoAuto(posti,scanner);
                    break;

                case 2 : 
                    parcheggio.uscitaAuto(posti, scanner);
                    break;
                case 3 :
                    System.out.println("stiamo uscendo....");
                default:
                    System.out.println("errore,scegli meglio");
            }
        }while(scelta!=3);

        scanner.close();
    }
}