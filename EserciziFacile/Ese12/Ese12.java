package Ese12;

public class Ese12 {
    
    public static void main(String[] args){

        if(args.length <3 || args.length % 2 ==0){
            System.out.println("Java Ese12 <numero> <op> <numero> ...");
            System.out.println("Esempio: java Ese12 5+3*2");
            return ;
        }   
    

        double risultato = Double.parseDouble(args[0]);

        for (int i=1; i<args.length; i += 2 ){
            String operazione=args[i];
            double numero = Double.parseDouble(args[i+1]);


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
