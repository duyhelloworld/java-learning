package exception;

public class ExceptPropagation {
    void method1() {
        int num = 10 / 0;
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            int lengthErr = e.getLocalizedMessage().length();
            System.out.println(e.getClass().getCanonicalName());
            for (int i = 0; i < lengthErr; i++) {
                System.out.print("*** ");
            }
            System.out.println("\nHandled Exception.");
        }
    }

    public static void main(String[] args) {
        ExceptPropagation ep = new ExceptPropagation();
        ep.method3();
    }
}
