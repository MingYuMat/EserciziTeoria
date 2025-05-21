package Es1;



public class Es1 {
    public static void main(String[] args) {
        int somma = 0;

        //for each . percorro un array(args) di elementi che chiamo arg di tipo string  
        for (String arg : args) {
            try {
                int numero = Integer.parseInt(arg);
                somma += numero;
            } catch (NumberFormatException e) {
                System.out.println("Argomento non valido (ignorato): " + arg);
            }
        }

        System.out.println("Somma totale: " + somma);
    }
}