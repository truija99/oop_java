public class Ring {
    public Double raadius;
    public Double x; //kordinaat x ja y
    public Double y;

    public Ring() {
        this.raadius =  0.0; //double tüüpi, sellepärast 2 0-i
    }


    public Ring (Double r) {
        this.raadius = r;
    }

    public Double pindala() {
        Double ringiPindala = Math.PI * Math.pow(raadius, 2);
        return ringiPindala;
    }

    public void ringiKirjeldus(){
        System.out.println("Antud ringi raadius on " + raadius);
        Double ringiPindala = pindala();
        System.out.println("Antud ringi pindala on " + Math.round(ringiPindala * 100)/100.0);
    }
}

