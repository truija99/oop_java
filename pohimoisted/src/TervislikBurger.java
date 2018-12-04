public class TervislikBurger {
    private String nimetus;
    private String liha;
    private String mustTeraleib;
    private Double hind;

    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;
    private String tervislikLisand3;
    private Double tervislikLisand3Hind;
    private String tervislikLisand4;
    private Double tervislikLisand4Hind;
    private String tervislikLisand5;
    private Double tervislikLisand5Hind;
    private String tervislikLisand6;
    private Double tervislikLisand6Hind;




    // konstruktor

    public TervislikBurger(String nimetus, String liha, String mustTeraleib, Double hind, String tervislikLisand1, Double tervislikLisand1Hind, String tervislikLisand2, Double tervislikLisand2Hind, String tervislikLisand3, Double tervislikLisand3Hind, String tervislikLisand4, Double tervislikLisand4Hind, String tervislikLisand5, Double tervislikLisand5Hind, String tervislikLisand6, Double tervislikLisand6Hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.mustTeraleib = mustTeraleib;
        this.hind = hind;
        this.tervislikLisand1 = "salat";
        this.tervislikLisand1Hind = tervislikLisand1Hind;
        this.tervislikLisand2 = "tomat";
        this.tervislikLisand2Hind = tervislikLisand2Hind;
        this.tervislikLisand3 = "kurk";
        this.tervislikLisand3Hind = tervislikLisand3Hind;
        this.tervislikLisand4 = "juust";
        this.tervislikLisand4Hind = tervislikLisand4Hind;
        this.tervislikLisand5 = "sibul";
        this.tervislikLisand5Hind = tervislikLisand5Hind;
        this.tervislikLisand6 = "muna";
        this.tervislikLisand6Hind = tervislikLisand6Hind;
    }



    public void valiTervislikLisand1(String tervislikLisand1, Double tervislikLisand1Hind){
        System.out.println("See Tervislikurger1 on lisandiga " + this.tervislikLisand1 " ja maksab " + this.tervislikLisand1Hind + "eurot");
    }

    public void valiTervislikLisand2(String tervislikLisand2, Double tervislikLisand2Hind){
        System.out.println("See Burger2 on lisandiga " + this.tervislikLisand2 " ja maksab " + this.tervislikLisand2Hind + "eurot");
    }

    public void valiTervislikLisand3(String tervislikLisand3, Double tervislikLisand3Hind){
        System.out.println("See Burger3 on lisandiga " + this.tervislikLisand3 " ja maksab " + this.tervislikLisand3Hind + "eurot");
    }

    public void valiTervislikLisand4(String tervislikLisand4, Double tervislikLisand4Hind){
        System.out.println("See Burger4 on lisandiga " + this.tervislikLisand4 " ja maksab " + this.tervislikLisand4Hind + "eurot");
    }
    public void valiTervislikLisand5(String tervislikLisand5, Double tervislikLisand5Hind){
        System.out.println("See Burger4 on lisandiga " + this.tervislikLisand5 " ja maksab " + this.tervislikLisand5Hind + "eurot");
    }
    public void valiTervislikLisand6(String tervislikLisand6, Double tervislikLisand46ind){
        System.out.println("See Burger4 on lisandiga " + this.6 " ja maksab " + this.tervislikLisand6Hind + "eurot");
    }



}
