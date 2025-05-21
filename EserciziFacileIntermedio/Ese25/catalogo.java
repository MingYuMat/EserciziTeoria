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
        //Predicate mi dice che criterio di tipo T puo essere vero o falso secondo la condizione che noi gli diamo
        List<T> risultato= new ArrayList<>();
        for (T x : elementi){
            if(criterio.test(x)){ //se test mi da positivo scrivo 
                risultato.add(x);
            }
        }
        return risultato;
    }

    public List<T> getTutti(){
        return new ArrayList<>(elementi);
    }
} 
