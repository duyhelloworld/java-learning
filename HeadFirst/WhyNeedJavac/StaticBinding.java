package WhyNeedJavac;

/**
 * StaticBinding
 */
public class StaticBinding {

    String eat() {
        System.out.println("I\"m String");
        return "String";
    }

    public static void main(String[] args) {
        StaticBinding sb = new StaticBinding();
        sb.eat();
    }
}