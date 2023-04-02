package exception;

import exception.InvalidAgeException;

public class MyException extends Exception {
    public MyException(String errMsg) {
        super(errMsg);
    }

    public static void checkAge(int age) throws InvalidAgeException
    {
        if (age > 0 || age < 100) {
            System.out.println("Passed.");
        } else {
            throw new InvalidAgeException("Age is not enough to buy alcohol.");
        }
    }

    public static void main(String[] args) {
        try {
        checkAge(0);
    } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println("Err : " + e + " surrounded by " + e.getLocalizedMessage());
        }
    }
}
