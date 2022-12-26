package WhyNeedJavac;

/**
 * StaticBinding
 */
public class StaticBinding {

    String getName() {
        return "I\" in Static";
    }

    public static void main(String[] args) {
        StaticBinding sb = new StaticBinding();
        System.out.println(sb.getName());

        // > Data type + value is static when run app
    }
}