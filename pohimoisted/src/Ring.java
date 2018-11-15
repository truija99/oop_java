public class Ring {
    public Double raadius;
    public Double x; //kordinaat x ja y
    public Double y;

    public void pindala() {
        Double s = 3.14 * raadius * raadius;
        System.out.println(s);
    }
}
