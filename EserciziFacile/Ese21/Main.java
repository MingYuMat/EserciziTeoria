package Ese21;

public class Main {
    
    public static void main(String[] args) {
        
        paga[] elementi = {new fattura("stampante", 2, 150.0),new abbonamento("netflix", 14.99, 12)};

        System.out.println("Spesa totale da pagare: ");
        for (paga p : elementi){
            System.out.println(p);
        }
    }
}
