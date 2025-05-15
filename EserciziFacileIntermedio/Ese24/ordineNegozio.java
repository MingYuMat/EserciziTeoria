package Ese24;

public class ordineNegozio implements spendibile{
    
    private String codiceOrdine;

    public ordineNegozio(String codiceOrdine){
        this.codiceOrdine=codiceOrdine;
    }

    @Override
    public String spedizione(){
        return "Ordine Negozio ["+ codiceOrdine+"] pronto per il ritiro in negozio";
    }
}
