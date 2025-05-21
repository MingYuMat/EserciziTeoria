package Es9;

public class Es9 {
    
    public static void main(String[] args) {
        
        Integer[] numeri = {1,2,3,4,5};
        //il tipo di variabile è contatore che lavora su oggetti integer 
        Contatore<Integer> contatoreNumeri= new Contatore<Integer>(numeri); //passo al costruttore  numeri come argomento 

        System.out.println("numeri interi: "+ contatoreNumeri.conta()); //il metodo conta mi dice quanto è lungo l'array

        String[] parole={"ciao","prof","dammi","trenta"};
        Contatore<String> contatoreStringhe= new Contatore<String>(parole); //stesso processo contatore non lavora con int ma con string 

        System.out.println("numero di stringhe: "+ contatoreStringhe.conta());
    }
}

