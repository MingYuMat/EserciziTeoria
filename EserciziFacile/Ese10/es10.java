package Ese10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class es10 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<squadra> classifica = new ArrayList<squadra>();

        System.out.println("quante squadre vuoi inseire?");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i=0;i<n;i++){
            System.out.println("\n squdra "+(i+1)+": "); //i=0 quindi devo partire aumentando di 1
            System.out.println("Nome: ");
            String nome=scanner.nextLine();

            System.out.println("Punti: ");
            int punti=Integer.parseInt(scanner.nextLine());
            //ricevo i valori da tastiera mettendoli in variabili
            
            //aggiungo un nuovo eleemento al mio ArrayList creando una nuova istanza sqaudra con i dati appena ottenuti
            classifica.add(new squadra(nome, punti));

        }

        //funzione per ordinare i valori dell'array classifica secondo i valori di punti
        Collections.sort(classifica,new Comparator<squadra>() {
            public int compare(squadra s1, squadra s2){
                return Integer.compare(s2.getPunti(), s1.getPunti());
            }
        });

        //stampa
        System.out.println("la classsifica finale: ");
        for (int j=0;j< classifica.size();j++){
            System.out.println((j+1)+"' "+ classifica.get(j));
        }

        scanner.close();
    }    
}
