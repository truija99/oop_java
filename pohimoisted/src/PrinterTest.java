public class PrinterTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer (50, false); //ei ole kahepoolne
        printer1.lisaTooner(15);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() + "%"); //get tooneritase jaoks pidin looma setteri

        printer1.lisaTooner(50);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() + "%");
    }
}
