package exception;

public class NonChecked extends Throwable {
    public static void main(String[] args) {
        try {
            int NaN = 100 / 0;
            String nulll = null;
            System.out.println(nulll.length());

            // >>> Throw keyword
            int[] arr = { 1, 3, 4 };
            System.out.println(arr[10]);
            throw new IndexOutOfBoundsException("Index is greater than array's length.");

        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getLocalizedMessage());
            System.out.println("Please check your code again.");
        } catch (NullPointerException ex) {
            System.out.println("Error : " + ex.getLocalizedMessage());
        } catch (IndexOutOfBoundsException exep) {
            exep.printStackTrace();
            System.out.println(exep.toString());
        }
    }
}
