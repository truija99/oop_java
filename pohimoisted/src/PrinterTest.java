public class PrinterTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer (150, true); //ei ole kahepoolne
        printer1.lisaTooner(15);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() + "%"); //get tooneritase jaoks pidin looma setteri

        Integer kontrolltoo = printer1.prindi(5); //käivitan printeri, ütlen et prindiks 3 lehte
        System.out.println("Printisin kontrolltöö jaoks " + kontrolltoo + " paberi lehte ja printeris on jäänud " + printer1.getPaberPrintimiseks() + " paberi lehte");
        printer1.lisaPaber(50);
        kontrolltoo = printer1.prindi(5);
        System.out.println("Printisin kontrolltöö jaoks " + kontrolltoo + " paberi lehte ja printeris on jäänud " + printer1.getPaberPrintimiseks() + " paberi lehte");
    }



}
