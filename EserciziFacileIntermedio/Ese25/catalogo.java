package Ese25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class catalogo<T> {

    private List<T> elementi = new ArrayList<>();

    public void aggiungi(T elemento){
        elementi.add(elemento);
    }

    public List<T> filtra(Predicate<T> criterio){
        List<T> risultato= new ArrayList<>();
        for (T x : elementi){
            if(criterio.test(x)){
                risultato.add(x);
            }
        }
        return risultato;
    }

    public List<T> getTutti(){
        return new ArrayList<>(elementi);
    }
} 
