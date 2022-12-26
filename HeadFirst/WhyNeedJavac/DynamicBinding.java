package WhyNeedJavac;

/**
 * DynamicBinding
 */

class ClassOut {

    String getName() {
        return "I\" Duy";
    }
}

public class DynamicBinding extends ClassOut {
    String getName() {
        return "I\" Daika, not Duy";
    }
    public static void main(String[] args) {
        ClassOut a = new DynamicBinding();
        System.out.println(a.getName());
        // Daika
    
        // > Data type + value of a is set when run app
    }
    
}