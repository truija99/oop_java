public class Tervitus {
//  omadused
    public  static String tervitusTekst;
// meetodid
    public static void tervita() {
        System.out.println(tervitusTekst);
    }
    /*käivitamiseks*/
    public static void main(String[] args) {
        tervitusTekst = "Tere, Mari-Liis";
        tervita ();
    }
}
