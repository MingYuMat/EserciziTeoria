package Ese33;

import java.util.Scanner;

public class Ese33_v2 {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); //geenro la mia istanza unica per tutto il tempo di esecuzione del programma
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci messaggi da loggare. Digita 'esci' per terminare.");

        while (true) {
            System.out.print("--> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("esci")) {
                break;
            }

            logger.log(input); //vado a scrivere su file quanto ricevuto da tastiera
        }

        logger.chiudi();
        scanner.close();
        System.out.println("Log salvato in log.txt");
    }
}

