public class Kujund {
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

    // klassi konstruktor - võimaldab nimetuse pann, LOON
    public Kujund(String nimi) {
        System.out.println("Kujund klassi konstruktor");
        this.nimetus = nimi;
    }
//  setterid
    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    public void setNurkadeOlemasolu(Boolean nurkadeOlemasolu) {
        this.nurkadeOlemasolu = nurkadeOlemasolu;
    }

    public void setNurkadeArv(Integer nurkadeArv) {
        this.nurkadeArv = nurkadeArv;
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

//      getterid


    public String getNimetus() {
        return nimetus;
    }

    public Boolean getNurkadeOlemasolu() {
        return nurkadeOlemasolu;
    }


    public Integer getNurkadeArv() {
        return nurkadeArv;
    }


}


