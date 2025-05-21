package Ese22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class ese22_v2 {
    public static void main(String[] args) {
        ArrayList<Diario> diario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quante voci vuoi inserire? ");
        int n = Integer.parseInt(scanner.nextLine()); //voglio inserire le voci da tastiera

        for (int i = 0; i < n; i++) {
            System.out.println("\nVoce #" + (i + 1));
            System.out.print("Inserisci il testo: ");
            String testo = scanner.nextLine(); //inserisco il testo della mia nota

            System.out.print("Inserisci la data (formato YYYY-MM-DD): ");
            String dataStr = scanner.nextLine(); //e mi segno la data in cui è stata scritta

            try {
                LocalDate data = LocalDate.parse(dataStr); //conversione da stringa a data 
                diario.add(new Diario(testo, data));
            } catch (Exception e) {
                System.out.println("Data non valida. Voce ignorata.");
            }
        }

        // Calcola la data di 7 giorni fa
        LocalDate setteGiorniFa = LocalDate.now().minusDays(7); //ottengo il valore di 7 giorni fa

        System.out.println("\nVoci degli ultimi 7 giorni:"); 
        for (Diario voce : diario) {
            if (!voce.getData().isBefore(setteGiorniFa)) { //se una voce è piu vecchia di 7 giorni non la voglio
                System.out.println(voce);
            }
        }

        scanner.close();
    }
}


