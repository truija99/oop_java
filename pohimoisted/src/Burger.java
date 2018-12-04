public class Burger {
//  -private +public
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    //konstruktor
    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
        this.lisand1 = "salat";
        this.lisand2 = "tomat";
        this.lisand3 = "muna";
        this.lisand4 = "juust";
        this.lisand1Hind = 1.1;
        this.lisand2Hind = 1.2;
        this.lisand3Hind = 1.3;
        this.lisand4Hind = 1.4;
    }



    //getterid ja setterid
    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public String getLiha() {
        return liha;
    }

    public void setLiha(String liha) {
        this.liha = liha;
    }

    public String getSai() {
        return sai;
    }

    public void setSai(String sai) {
        this.sai = sai;
    }

    public Double getHind() {
        return hind;
    }

    public void setHind(Double hind) {
        this.hind = hind;
    }

    public String getLisand1() {
        return lisand1;
    }

    public void setLisand1(String lisand1) {
        this.lisand1 = lisand1;
    }

    public Double getLisand1Hind() {
        return lisand1Hind;
    }

    public void setLisand1Hind(Double lisand1Hind) {
        this.lisand1Hind = lisand1Hind;
    }

    public String getLisand2() {
        return lisand2;
    }

    public void setLisand2(String lisand2) {
        this.lisand2 = lisand2;
    }

    public Double getLisand2Hind() {
        return lisand2Hind;
    }

    public void setLisand2Hind(Double lisand2Hind) {
        this.lisand2Hind = lisand2Hind;
    }

    public String getLisand3() {
        return lisand3;
    }

    public void setLisand3(String lisand3) {
        this.lisand3 = lisand3;
    }

    public Double getLisand3Hind() {
        return lisand3Hind;
    }

    public void setLisand3Hind(Double lisand3Hind) {
        this.lisand3Hind = lisand3Hind;
    }

    public String getLisand4() {
        return lisand4;
    }

    public void setLisand4(String lisand4) {
        this.lisand4 = lisand4;
    }

    public Double getLisand4Hind() {
        return lisand4Hind;
    }

    public void setLisand4Hind(Double lisand4Hind) {
        this.lisand4Hind = lisand4Hind;
    }




    public void valiLisand1(String lisand1, Double lisand1Hind){
        System.out.println("See Burger1 on lisandiga " + this.lisand1 " ja maksab " + this.lisand1Hind + "eurot");
    }

    public void valiLisand2(String lisand2, Double lisand1Hind){
        System.out.println("See Burger2 on lisandiga " + this.lisand2 " ja maksab " + this.lisand2Hind + "eurot");
    }

    public void valiLisand3(String lisand1, Double lisand1Hind){
        System.out.println("See Burger3 on lisandiga " + this.lisand3 " ja maksab " + this.lisand3Hind + "eurot");
    }

    public void valiLisand4(String lisand4, Double lisand4Hind){
        System.out.println("See Burger4 on lisandiga " + this.lisand4 " ja maksab " + this.lisand4Hind + "eurot");
    }






    public void koostaBurger() {

        ...

        System.out.println("Burger koos kõigi lisanditega maksab " + "eurot");
    }



    public void koostaTervislikBurger() {
        System.out.println("Tervislik burger koos kõigi lisanditega maksab " +this. "eurot");
    }

    public void koostaLuxBurger() {
        System.out.println("Lux burger koos kõigi lisanditega maksab " + "eurot");
    }

}

