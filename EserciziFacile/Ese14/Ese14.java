package Ese14;

public class Ese14{
    
    public static void main(String[] args) {
        
        //utilizzo di un array bidimensionale 
        int[][] presenze = {
            {1,1,1,1,0},
            {1,1,1,0,0},
            {1,1,0,0,0},
            {1,0,0,0,0},
            {0,0,0,0,0}
        };

        System.out.println("Presente settimanali: ");

        for(int i=0;i < presenze.length;i++){ //ogni i rappresenta una persona. ogni j le sue presenze
            int totale=0;
            
            for(int j=0;j< presenze[i].length;j++){
                totale += presenze[i][j];
            }

            System.out.println("studente "+(i+1)+": "+totale+" presenze");
        }
    }
}


/*
* questo codice non considerava la classe studente. solamente Ese14_a fa uso della classe studente
* anche se non era richiesto dall'esercizio  
*/