package Es5;

import java.util.ArrayList;

public class es5 {
    
    public static void main(String[] argc){

        ArrayList<forma> forme = new ArrayList<forma>();

        //aggiungiamo elementi
        forme.add(new cerchio(3.0));
        forme.add(new rettangolo(4.0, 5.0));
        forme.add(new cerchio(2.5));
        forme.add(new rettangolo(2.0, 7.0));
        
        int i = 1;
        for (forma x : forme){
            System.out.println("area della figura: "+ i + ": " + x.area());
        }
    }
}
