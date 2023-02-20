package factory;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee latteCoffee = CoffeeFactory.getCoffee(CoffeeType.CAPUCINO);
        System.out.println(latteCoffee.getCoffeeName());
    }
}
