public class Kujund {
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

    // klassi konstruktor - võimaldab nimetuse pann, LOON
    public Kujund(String nimi) {
        this.nimetus = nimi;
    }

    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    // tüübi tegevused - klassi meetodid  -
    // panin paika, et tuleb void tüüpi meetod, mis lihtsalt väljustab sõna
    public void arvutaPindala() {
        System.out.println("Kujund klassi arvutapIndala() meetod");
    }

    //kui loome kujundi, oleks tore tema kohta midagi teada, KUTSUN KIRJELDUSE
    public void valjastaKirjeldus(){
        System.out.println(this.nimetus);
        //kutsun tööle
        this.arvutaPindala();
        System.out.println();
    }
}

