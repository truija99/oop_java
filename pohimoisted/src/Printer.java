public class Printer {
    private Integer tooneriTase;
    private Integer paberPrintimiseks;
    private Boolean kahepoolne;

    public Printer(Integer tooneriTase, Boolean kahepoolne) {
        this.tooneriTase = tooneriTase;
        this.kahepoolne = kahepoolne;
        this.paberPrintimiseks = 100;
    }


    public Integer getTooneriTase() {  //see läks PrinterTest sout asja
        return tooneriTase;
    }

    public Integer lisaTooner(Integer toonerJuurde) {       //peame kontrollima tooneri taset
        if (tooneriTase >=  0 & this.tooneriTase <= 100) {
            if(this.tooneriTase + toonerJuurde > 100) {
                return -1;  //kui asi läheb üle 100, annab ta mingi suva arvu vist
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;  //annab veateate vms, pole testklassi kaudu võimalik juurde panna midagi
        }
    }

    public Integer prindi(Integer lehtedeArv){  //on olemas lehed, mida peame välja printima
        Integer paberiKulu = lehtedeArv;
        if(this.kahepoolne) {
            paberiKulu = lehtedeArv / 2 + lehtedeArv % 2;
            System.out.println("kahepoolne printimine");
        }
        this.paberPrintimiseks = this.paberPrintimiseks - paberiKulu;
        return paberiKulu;    //vaja tagastada põhiprogrammile
    }

    public Integer getPaberPrintimiseks() {  //aitab esile kutsuda???
        return paberPrintimiseks;
    }
}