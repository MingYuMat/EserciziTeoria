package Ese12;

public class Ese12 {
    
    public static void main(String[] args){

        if(args.length <3 || args.length % 2 ==0){
            System.out.println("Java Ese12 <numero> <op> <numero> ...");
            System.out.println("Esempio: java Ese12 5+3*2");
            return ;
        }   
        //rendo l'esercizio un po piu complesso, ora posso fare piu operazioni in fila

        double risultato = Double.parseDouble(args[0]);//inserisco primo valore in risultato

        for (int i=1; i<args.length; i += 2 ){ //vado avanti di due perche devo saltare l'operatore
            String operazione=args[i]; //mi segno l'operatore 
            double numero = Double.parseDouble(args[i+1]); //mi segno il numero

            //in base al tipo di operatore eseguo l'operazione
            switch (operazione) {
                case "+":
                    risultato += numero;
                    break;
            
                case "-":
                    risultato -= numero;
                    break;
                case "*":
                    risultato *=numero;
                    break;
                case "/":
                    if(numero ==0){
                        System.out.println("non si divide per zero");
                        return;
                    }
                    risultato /= numero;
                    break ;
                default:
                    System.out.println("operazione non valida: "+operazione);
                    return;
            }  
        }

        System.out.println("risultato: "+ risultato);
    }
}
