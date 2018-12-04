public class BurgerTest {
    public static void main(String[] args) {
        Burger burger = new Burger ("Burger");
        Burger tervislikburger = new TervislikBurger("Tervislik Burger");
        Burger luxburger = new LuxBurger("Lux Burger");
        burger.koostaBurger();
        tervislikburger.koostaTervislikBurger();
        luxburger.koostaLuxBurger();
    }
}
