package Es9;

public class Es9 {
    
    public static void main(String[] args) {
        
        Integer[] numeri = {1,2,3,4,5};
        Contatore<Integer> contatoreNumeri= new Contatore<Integer>(numeri);

        System.out.println("numeri interi: "+ contatoreNumeri.conta());

        String[] parole={"ciao","prof","dammi","trenta"};
        Contatore<String> contatoreStringhe= new Contatore<String>(parole);

        System.out.println("numero di stringhe: "+ contatoreStringhe.conta());
    }
}

