public class Tervitus {
    public  static String tervitusTekst;

    public static void tervita() {
        System.out.println(tervitusTekst);
    }
    /*käivitamiseks*/
    public static void main(String[] args) {
        tervitusTekst = "Tere, Mari-Liis";
        tervita ();
    }
}
