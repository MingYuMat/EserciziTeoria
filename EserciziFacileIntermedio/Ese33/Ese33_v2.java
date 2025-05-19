package Ese33;

import java.util.Scanner;

public class Ese33_v2 {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci messaggi da loggare. Digita 'esci' per terminare.");

        while (true) {
            System.out.print("--> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("esci")) {
                break;
            }

            logger.log(input);
        }

        logger.chiudi();
        scanner.close();
        System.out.println("Log salvato in log.txt");
    }
}

