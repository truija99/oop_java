public class Kujundid {
    public static void main(String[] args) {
        //nimi tuleb tühikuga, ise ei kirjuta
        Kujund ring = new Kujund ("Ring");
        Kujund ruut = new Kujund ("Ruut");
        Kujund kolmnurk = new Kujund ("Kolmnurk");

        ring.valjastaKirjeldus();
        ruut.valjastaKirjeldus();
        kolmnurk.valjastaKirjeldus();
    }
}


