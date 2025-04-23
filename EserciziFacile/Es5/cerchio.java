package Es5;


public class cerchio implements forma{

    private double raggio;

    public cerchio(double raggio){
        this.raggio=raggio;
    }

    @Override
    public double area(){
        return Math.PI*raggio*raggio;
    }
    
}
