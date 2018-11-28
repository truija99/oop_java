public class Magamistuba {
    public static void main(String[] args) {
//        loome 4 seina toa ehitamiseks
        Sein sein1 = new Sein("põhi");
        Sein sein2 = new Sein("lõuna");
        Sein sein3 = new Sein("lääne");
        Sein sein4 = new Sein("ida");

        Lagi lagi = new Lagi(3.5, "soe valge");
        System.out.println("Kõrgus = " + lagi.getKorgus());
        System.out.println("Värv = " + lagi.getVarv());
    }
}