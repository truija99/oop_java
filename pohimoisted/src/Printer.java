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
                return -1;
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;
        }
    }

}