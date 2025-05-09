package EsercizioFattoInClasse;
import java.util.ArrayList;
import java.util.List;


public class Esercizio1 {

    public static void main(String[] args) {
        List<Veicolo> flotta = new ArrayList<>();
        flotta.add(new auto("AB111CD"));
        flotta.add(new auto("AB222CD"));

        for (Veicolo veicolo : flotta){
            veicolo.avvia();
        }

        for (Veicolo veicolo : flotta){
            veicolo.ferma();
        }
    }
}