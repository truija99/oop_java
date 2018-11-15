public class Ring {
    public Double raadius;
    public Double x; //kordinaat x ja y
    public Double y;

    public Ring() {
        this.raadius =  0.0; //double tüüpi, sellepärast 2 0-i
    }

    public void pindala() {
        Double s = 3.14 * raadius * raadius;
        System.out.println(s);
    }
}
