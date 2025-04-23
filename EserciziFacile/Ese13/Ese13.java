package Ese13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ese13 {

    public static void main(String[] args) {
        ArrayList<Prodotto> lista = new ArrayList<Prodotto>();

        lista.add(new Prodotto("libro", "A111B",100.00));
        lista.add(new Prodotto("tablet", "B222B", 200.00));
        lista.add(new Prodotto("computer", "C333C", 400.00));

        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il codice del prodotto da cercare: ");
        String ricerca = input.nextLine();

        boolean trovato = false;
        for (Prodotto x : lista){
            if(x.getCodice().equalsIgnoreCase(ricerca)){
                System.out.println("trovato");
                System.out.println(x);
                trovato = true ;
                break;
            }
        }

        if(!trovato){
            System.out.println("il prodottto associato al codice: "+ricerca+ " non è stato trovato");
        }
        
        input.close();
    }
    
}
