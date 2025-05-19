package Ese34;

public class ese34 {

    public static void main(String[] args) {
        
        parcheggio box = new parcheggio(5);

        auto audi = new auto("ab1111cd");
        auto ferrari = new auto("bb1111cc");
        auto lambo = new auto("nnn111nnn");

        box.entraAuto(ferrari);
        box.entraAuto(lambo);
        box.entraAuto(audi);

        System.out.println("--stato--");
        box.stampaStato();

        box.esciAuto("aa1111cd");

        System.out.println("-- usciito veicolo ab1111cd");
        box.stampaStato();

        auto mercedes = new auto("hh222hh");
        box.entraAuto(mercedes);

        System.out.println(("dopo acesso hh222hh"));
        box.stampaStato();

    }    
}
