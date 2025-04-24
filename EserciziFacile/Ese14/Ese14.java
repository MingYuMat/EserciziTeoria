package Ese14;

public class Ese14{
    
    public static void main(String[] args) {
        
        int[][] presenze = {
            {1,1,1,1,0},
            {1,1,1,0,0},
            {1,1,0,0,0},
            {1,0,0,0,0},
            {0,0,0,0,0}
        };

        System.out.println("Presente settimanali: ");

        for(int i=0;i < presenze.length;i++){
            int totale=0;
            
            for(int j=0;j< presenze[i].length;j++){
                totale += presenze[i][j];
            }

            System.out.println("studente "+(i+1)+": "+totale+" presenze");
        }
    }
}
