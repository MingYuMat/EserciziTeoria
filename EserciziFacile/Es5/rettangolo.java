package Es5;

public class rettangolo implements forma {
    
    private double base;
    private double altezza;

    public rettangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    @Override
    public double area(){
        return base*altezza;
    }
}
