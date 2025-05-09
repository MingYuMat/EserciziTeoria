package Ese20;

import java.util.*;

public class SortParole {
    
    public static void main(String[] args){

        if(args.length == 0){
            System.out.println("non mi hai dato nessuna parola");
            return ;
        }

        Arrays.sort(args);

        System.out.println("Parole ordinate: ");
        for(String parola : args){
            System.out.println(parola);
        }
    }
}

