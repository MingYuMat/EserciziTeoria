package Ese34;

public class postoAuto {
    
    private auto auto;

    public boolean isOccupato(){
        return auto != null;
    }

    public boolean entraAuto(auto a ){
        if(!isOccupato()){ // se non è occupato riepi
            this.auto=a;
            return true ;
        }
        return false;
    }

    public boolean esciAuto(){
        if(!isOccupato()){ //se non è occupato svuota 
            this.auto=null;
            return true;
        }

        return false;
    }

    public auto getAuto(){
        return auto;
    }
}
