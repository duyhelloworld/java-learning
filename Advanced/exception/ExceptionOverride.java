package exception;

class Parent {
    void print() throws Exception {
        int num = 100 / 0;
    }
}

public class ExceptionOverride extends Parent {
    @Override
    void print() throws ArithmeticException {
        System.out.println("Child handler.");
    }

    // --- Superclass has thrown exception
    //          --> Child only can handle unchecked Exception

    // --- Super not thrown Exception
    //          --> child can do everything except thrown parent's exception
    public static void main(String[] args) {
        ExceptionOverride eov = new ExceptionOverride();
        eov.print();
    }
}
