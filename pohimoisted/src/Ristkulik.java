public class Ristkulik extends Kujund{
    //   objekti omadused - klassi muutujad
    private Double pikkus;
    private Double laius;
    private Integer nurk;


    public Ristkulik(String nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.setNurkadeOlemasolu(true);
        this.setNurkadeArv(4);
        this.nurk = 90;
        System.out.println("Ristküliku klassi konstruktor");
    }


    @Override
    public void arvutaPindala() {
        System.out.println("Ristkülik klassi arvutaPindala() meetod");
        this.setPindala(this.pikkus * this.laius);
        System.out.println("Pindala = " + this.getPindala());
    }

    @Override
    public void valjastaKirjeldus() {
        System.out.println("Ristküliku klassi valjastaKirjeldus()");
        System.out.println(this.getNimetus());
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
        if(this.getNurkadeOlemasolu()) {
            System.out.println("Kokku on " + this.getNurkadeArv() + " nurka");
        }
        System.out.println("Nurgad on " + this.nurk + " kraadi.");
    }
}
