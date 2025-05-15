package Ese24;

public class ordineOnline implements spendibile{
    private String codiceOrdine;

    public ordineOnline(String codiceOrdine){
        this.codiceOrdine=codiceOrdine;
    }

    @Override
    public String spedizione(){
        return "Ordine Online ["+codiceOrdine+"] spedito tramite corriere";
    }
}
