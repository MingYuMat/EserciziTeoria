package Ese25;

public class Ese25 {
    public static void main(String[] args) {

        catalogo<prodotto> catalogo = new catalogo<prodotto>();

        catalogo.aggiungi(new prodotto("laptop",1200,true));
        catalogo.aggiungi(new prodotto("mouse",25,true ));
        catalogo.aggiungi(new prodotto("Stampante", 150.0, false));
        catalogo.aggiungi(new prodotto("Monitor", 300.0, true));
        catalogo.aggiungi(new prodotto("Cuffie", 80.0, false));
    
        System.out.println("\n I prodotti sotto 100 euro");
        catalogo.filtra(p-> p.getPrezzo()<100).forEach(System.out::println); //stampo ogni elemento della lista che filtrato risulta avere il prezzo minore di zero 

         System.out.println("\n Prodotti disponibili:");
        catalogo.filtra(prodotto::isDisponibile).forEach(System.out::println);
    }

}
