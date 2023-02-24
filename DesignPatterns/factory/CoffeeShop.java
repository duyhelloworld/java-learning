package factory;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee capucino = CoffeeFactory.getCoffee(CoffeeType.CAPUCINO);
        System.out.println(capucino.getCoffeeName());

        Coffee espressino = CoffeeFactory.getCoffee(CoffeeType.CAPUCINO);
        System.out.println(espressino.getCoffeeName());

        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.CAPUCINO);
        System.out.println(americano.getCoffeeName());
    }
}
