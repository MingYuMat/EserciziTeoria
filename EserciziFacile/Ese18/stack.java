package Ese18;

import java.util.ArrayList;

public class stack<T> {

    private ArrayList<T> elementi= new ArrayList<>();

    public void push(T valore){
        elementi.add(valore);
    }

    public boolean isEmpty(){
        return elementi.isEmpty();
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("lo stack è vuoto");
            return null;
        }
        return elementi.remove(elementi.size()-1);
    }

    public T peek(){
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
