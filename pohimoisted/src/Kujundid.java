public class Kujundid {
    public static void main(String[] args) {
        //nimi tuleb tühikuga, ise ei kirjuta
//      Kujund ring = new Kujund ("Ring");                   lisab  topelt kujund klassi konstruktor teksti
 //     Kujund ruut = new Kujund ("Ruut");
 //     Kujund kolmnurk = new Kujund ("Kolmnurk");

 //        ring.valjastaKirjeldus();

          /*Need read tööle ei lähe, kuna nimetus on privaatne
          ring.nimetus="Ruut";
          ring.valjastaKirjeldus();   */

//          ring.setNimetus("Ruut");
//          ring.valjastaKirjeldus();

//        ruut.valjastaKirjeldus();
//        kolmnurk.valjastaKirjeldus();

        Ristkulik ristkulik = new Ristkulik( "Ristküliku", 10.0, 5.0); //tulevad ise tühikuga
        ristkulik.valjastaKirjeldus();
        ristkulik.arvutaPindala(false);
    }
}


