package Ese34;

public class parcheggio {
    
    private postoAuto[] posti;

    public parcheggio(int numeroposti){
        posti = new postoAuto[numeroposti];

        for(int i =0;i< numeroposti; i++){
            posti[i]= new postoAuto();
        }
    }

    public boolean entraAuto(auto a){
        for(postoAuto x : posti){
            if(x.entraAuto(a)){
                return true;
            }
        }

        return false;
    }

    public boolean esciAuto(String targa){ //se il posto è occupato e la targa coincide esci 
        for(postoAuto y : posti){
            if(y.isOccupato() && y.getAuto().getTarga().equals(targa)){
                return y.esciAuto(); 
            }
        }
        return false;
    }

    public void stampaStato(){
        for(int j = 0;j<posti.length;j++){
            postoAuto x = posti[j];

            System.out.println("posto "+(j+1)+": ");
            if(x.isOccupato()){ // se il posto è occupato dimmi che macchina lo occupa 
                System.out.println(x.getAuto());
            }else{ //se no scrivi libero 
                System.out.println("libero");
            }
        }
    }
}
