public class PrinterTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer (50, false); //ei ole kahepoolne
        System.out.println("Printeris on " + printer1.paberPrintimiseks + " lehti printimiseks");
        System.out.println("Printeri tooneri tase on " + printer1.tooneriTase + "%");

        // muudame printeri seisundi
        printer1.paberPrintimiseks = 45; //45 lehte juures
        printer1.tooneriTase = 120;
        System.out.println("Printeri tooneri tase on " + printer1.tooneriTase + "%");
        System.out.println("Printeris on " + printer1.paberPrintimiseks + " lehti printimiseks");
    }
}
