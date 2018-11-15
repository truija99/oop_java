public class Tervitus {
//  omadused
    public String tervitusTekst;

    public Tervitus(String t) {
        this.tervitusTekst = t;  //this - mina, selle kindla objekti oma; t on objekti parameeter
    }

    // meetodid
    public void tervita() {
        System.out.println(tervitusTekst);
    }

}
