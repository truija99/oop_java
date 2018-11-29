public class Printer {
    private Integer tooneriTase;
    private Integer paberPrintimiseks;
    private Boolean kahepoolne;

    public Printer(Integer tooneriTase, Boolean kahepoolne) {
        if(tooneriTase >= 0 & tooneriTase <= 100) {
            this.tooneriTase = tooneriTase;  //pidime selle muutma ära, sest muidu läks tooneri tase üle 100
        } else if(tooneriTase > 100){
            this.tooneriTase = 100;
        } else {
            this.tooneriTase = 0;
        }
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

    public Integer prindi(Integer lehtedeArv) {  //on olemas lehed, mida peame välja printima
        Integer paberiKulu = lehtedeArv;
        if (this.kahepoolne) {          //peame lisama if lause veel
            paberiKulu = lehtedeArv / 2 + lehtedeArv % 2;
            System.out.println("kahepoolne printimine");
        }
        if (paberiKulu > this.paberPrintimiseks) {
            System.out.println("Printeris ei jätku paberit.");
            System.out.println("Lisa " + (paberiKulu - this.paberPrintimiseks) + "paberit.");
            return 0;
        } else {
            this.paberPrintimiseks = this.paberPrintimiseks - paberiKulu;
            return paberiKulu;
        }
    }

    public Integer lisaPaber(Integer lehtedeArv){
        if(lehtedeArv > 0 & lehtedeArv < 500) {
            this.paberPrintimiseks = this.paberPrintimiseks + lehtedeArv;
            System.out.println("Printerisse on lisatud " + lehtedeArv + " paberit");
        }
        return this.paberPrintimiseks;
    }


    public Integer getPaberPrintimiseks() {  //aitab esile kutsuda???
        return paberPrintimiseks;
    }
}