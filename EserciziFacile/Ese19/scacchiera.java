package Ese19;

public class scacchiera {

    private pezzo[][] tabellone= new pezzo[8][8];

    public scacchiera(){
        inizializza();
    }

    private void inizializza(){
        String[] pezzi ={"torre","cavallo","alfiere","regina","re","alfiere","cavallo","torre"}; 
        //genero una lista da cui andro a prendere i pezzi da inserire nel mio tabellone

        for (int i=0;i<8;i++){
            tabellone[0][i]=new pezzo("B-" + pezzi[i]);
            tabellone[1][i]=new pezzo("pedone");
        }
        //inseriti i pezzi bianchi

        for (int i=2;i<6;i++){
            for (int j=0;j<8;j++){
                tabellone[i][j]= new pezzo("-");
            }
        }
        //spazio vuoto nella tabella

        for(int i=0;i<8;i++){
            tabellone[6][i]=new pezzo("N-pedone");
            tabellone[7][i]=new pezzo("N-"+ pezzi[i]);
    
        }
        //pezzi neri
    }

    public void stamp(){
        System.out.println("Scacchiera: ");
        for (int i=0;i<tabellone.length;i++){  //per ogni riga
            for (int j=0;j<tabellone[i].length;j++){ //stampo tutte le colonne  
                                
                System.out.print(String.format("%-12s",tabellone[i][j]));
            }
            
            System.out.println();
        }
        
    }
    
}
