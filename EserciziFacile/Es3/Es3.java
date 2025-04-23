package Es3;
import java.util.*;

public class Es3 {
    
    public static void main (String[] argc){
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contatto> contact = new ArrayList<Contatto>();
        

        System.out.println("Inserire i contatti");
        int Ncontatti = Integer.parseInt(scanner.nextLine());

        for(int i =0;i < Ncontatti;i++){
            System.out.println("inserisci il contatto "+ (i+1)+":");
            String nome = scanner.nextLine();

            System.out.println("inserisci numero di telefono di "+(i+1)+":");
            String numero = scanner.nextLine();

            contact.add(new Contatto(nome,numero));
        }

        /*contact.add(new Contatto("mario rossi","333 48559369"));
        contact.add(new Contatto("giusepper giordano", "333 9977838"));*/

        System.out.println("Rubrica: ");

        for (Contatto c : contact ) {
            c.StampaContatto();
        }

        scanner.close();
    }
}
