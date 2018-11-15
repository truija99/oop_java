public class TervitusTest {
    public static void main(String[] args) {
        //uue objekti loomine
        Tervitus annaTervitus = new Tervitus ("Tere õpilased!");
        Tervitus vaikeTervitus = new Tervitus ();
        annaTervitus.tervita();
        vaikeTervitus.tervita ();
    }
}
