package Ese18;


public class Ese18 {
    
    public static void main(String[] args){

        stack<String> stack = new stack<>();

        System.out.println("aggiungo elementi allo stack");
        stack.push("uno");
        stack.push("due");
        stack.push("tre"); //inserimento valori 

        stack.stampa();

        System.out.println("\nElemento in cima(peek): "+stack.peek()); //guardo 

        System.out.println("\nRimuovo elemento(pop): "+ stack.pop()); //tolgo 
        stack.stampa(); //ristampo

        System.out.println("\nStack vuoto? "+stack.isEmpty());

        System.out.println("\nRimuovo tutto: ");
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
