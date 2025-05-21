package Ese23;

import java.util.ArrayList;
import java.util.Scanner;

public class Ese23{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        sala sala1= new sala(1  ,  10);
        sala sala2=new sala(2,10);

        film film1= new film("avengers",sala1);
        film film2= new film("avatar",sala2);

        ArrayList<film> filmDisponibili = new ArrayList<>();
        filmDisponibili.add(film1);
        filmDisponibili.add(film2);

        
        while(true){
            //il mio menù
            System.out.println("\n---Accesso effettuato nella prenotazione cinema---");
            System.out.println("1- Prenota posti");
            System.out.println("2- Mostra le mie prenotazioni");
            System.out.println("3- exit");
            System.out.println("digita la tua scelta...");

            int scelta = scanner.nextInt();
            scanner.nextLine(); //mi serve per poter racogliere l'invio da tastiera

            switch (scelta) {
                case 1:
                    System.out.println("inserire nome spettaore");
                    String nome=scanner.nextLine();

                    System.out.println("Selezionare film");
                    for (int i=0;i<filmDisponibili.size();i++){
                        System.out.println((i+1)+". "+filmDisponibili.get(i).getTitolo()); 
                        //stampo titolo di tutti i film nella lista
                    }

                    int sceltaFilm= scanner.nextInt();
                    scanner.nextLine();

                    if(sceltaFilm < 1 || sceltaFilm > filmDisponibili.size()){ //scelgo il film
                        System.out.println("errore");
                        break;
                    }

                    film filmScelto = filmDisponibili.get((sceltaFilm-1)); //sceltaFilm-1 serve per poter lavorare con i valori dell'array
                    sala salaAssociata = filmScelto.getSala();

                   if(salaAssociata.prenotaPosto(nome,filmScelto)){ //controllo se possibile prenotare
                        System.out.println("prenotazione effettuata");
                   }else {
                        System.out.println("nessun posto disponibile per questo evento");
                   }
                   
                    break;
                
                case 2:
                   System.out.println("Visualizza posti in sala ");
                   System.out.println("1. Sala 1   2. Sala 2");
                   int salaNum= scanner.nextInt();
                   //sala salaDaVisionare = (salaNum==1)? sala1 : sala2;
                   sala salaDaVisionare = null;
                   if (salaNum == 1) {
                            salaDaVisionare = sala1;
                    } else if (salaNum == 2) {
                            salaDaVisionare = sala2;
                    } else {
                            System.out.println("Scelta non valida.");
                            break;
                    }
                    salaDaVisionare.mostraPrenotazione();
                    break;
                case 3:
                   System.out.println("Addios");
                   scanner.close();
                   return;
                default:   
                   System.out.println("Scelta non valida");
                    break;
            }
        }
        
    }
}