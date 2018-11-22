public class Punkt {
    private String nimetus;
    private Double x;  //ainult setteriga saab private asjale ligipääsu
    private Double y;
    private Integer veerand;

    public Punkt(String nimetus, Double x, Double y) {
        this.nimetus = nimetus;
        this.x = x;
        this.y = y;
    }

    public void setVeerand() {
        if(this.x > 0 & this.y > 0) this.veerand = 1;
        else if(this.x > 0 &  this.y < 0) this.veerand = 2;
        else if(this.x < 0 &  this.y < 0) this.veerand = 3;
        else if(this.x < 0 &  this.y > 0) this.veerand = 4;
        else this.veerand = 0;
    }


    //väljasta kirjeldus
    public void valjastaKirjeldus() {
        System.out.println("Punkt " + this.nimetus + " koordinaatidega (" + this.x + ";" + this.y + ") asub ") + this.veerand + " .veerandil." ;
    }
}

