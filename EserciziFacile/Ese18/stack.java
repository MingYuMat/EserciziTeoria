package Ese18;

import java.util.ArrayList;

public class stack<T> { //implementazione generica di uno stack 

    private ArrayList<T> elementi= new ArrayList<>(); //inizializzazione

    public void push(T valore){ //aggiungi valore 
        elementi.add(valore);
    }

    public boolean isEmpty(){ //questo mi dice se lo stack è vuoto ritornando false o true 
        return elementi.isEmpty();
    }

    public T pop(){ //mostro e rimuovo l'elemento in cima
        if(isEmpty()){
            System.out.println("lo stack è vuoto");
            return null;
        }
        return elementi.remove(elementi.size()-1); 
    }

    public T peek(){ //guardo il valore in cima 
        if(isEmpty()){
            System.out.println("lo stack è vuoto");
            return null;
        }

        return elementi.get(elementi.size()-1);
    }

    public void stampa(){
        System.out.println("contenuto dello stack: "+elementi);
    }    
}
