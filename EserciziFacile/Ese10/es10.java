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
            System.out.println("\n squdra "+(i+1)+": ");
            System.out.println("Nome: ");
            String nome=scanner.nextLine();

            System.out.println("Punti: ");
            int punti=Integer.parseInt(scanner.nextLine());

            classifica.add(new squadra(nome, punti));

        }

        Collections.sort(classifica,new Comparator<squadra>() {
            public int compare(squadra s1, squadra s2){
                return Integer.compare(s2.getPunti(), s1.getPunti());
            }
        });

        System.out.println("la classsifica finale: ");
        for (int j=0;j< classifica.size();j++){
            System.out.println((j+1)+"' "+ classifica.get(j));
        }

        scanner.close();
    }    
}
