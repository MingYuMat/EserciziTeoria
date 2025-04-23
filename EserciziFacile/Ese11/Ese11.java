package Ese11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ese11 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<Persona>();

        for(int i=0;i<2;i++){
            Persona p= new Persona();

            System.out.println("inserisci il nome della persona numero "+(1+i)+": ");
            p.setNome(scanner.nextLine());

            System.out.println("inserisci l'età della persona ");
            p.setEta(Integer.parseInt(scanner.nextLine()));

            lista.add(p);
        }

        System.out.println("\n---Dati inseriti correttamente---");
        for(Persona x : lista){
            System.out.println("nome: "+ x.getNome()+", Età "+ x.getEta());
        }

        scanner.close();
    }
}
