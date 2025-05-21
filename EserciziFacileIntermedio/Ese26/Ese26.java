package Ese26;

import java.util.ArrayList;

public class Ese26 {
    public static void main(String[] args) {
        
        ArrayList<conto> conti = new ArrayList<>();

        conti.add(new contoCorrente("mario rossi",15002.0));
        conti.add(new contoRisparmio("matteo tucci",25003.0));
        conti.add(new contoCorrente("piero pelu",30004.0));

        System.out.println("Calcolo interessi");
        for(conto x : conti){
            double interesse = x.calcolaInteresse();
            System.out.printf("%s -> interesse : $%.2f%n", x.toString(),interesse);
            //x.strign -> interesse : stampo 2 numeri deicmali float di interesse
        }
    }
}
