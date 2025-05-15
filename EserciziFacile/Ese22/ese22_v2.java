package Ese22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class ese22_v2 {
    public static void main(String[] args) {
        ArrayList<Diario> diario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quante voci vuoi inserire? ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nVoce #" + (i + 1));
            System.out.print("Inserisci il testo: ");
            String testo = scanner.nextLine();

            System.out.print("Inserisci la data (formato YYYY-MM-DD): ");
            String dataStr = scanner.nextLine();

            try {
                LocalDate data = LocalDate.parse(dataStr);
                diario.add(new Diario(testo, data));
            } catch (Exception e) {
                System.out.println("Data non valida. Voce ignorata.");
            }
        }

        // Calcola la data di 7 giorni fa
        LocalDate setteGiorniFa = LocalDate.now().minusDays(7);

        System.out.println("\nVoci degli ultimi 7 giorni:");
        for (Diario voce : diario) {
            if (!voce.getData().isBefore(setteGiorniFa)) {
                System.out.println(voce);
            }
        }

        scanner.close();
    }
}


