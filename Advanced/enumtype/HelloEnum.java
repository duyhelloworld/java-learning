// package enumtype;

import java.util.Scanner;

public class HelloEnum {
    public static void main(String[] args) {
        enum Days {
            Monday, Tuesday, Wednesday, Thurday, Friday, Saturday, Sunday
        }
        // > enum constants are public, static and final (unchangeable - cannot be overridden).
        // > Enum used when declare 
        // - Days, months
        // - Colors
        // - 52 Cards, ...
        
        System.out.println("Enter a number : ");
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            System.out.print("You choosed ");
            switch (num) {
            case 2:
                System.out.println(Days.Monday);
                break;
            case 3:
                System.out.println(Days.Tuesday);
                break;
            case 4:
                System.out.println(Days.Wednesday);
                break;
            case 5:
                System.out.println(Days.Thurday);
                break;
            case 6:
                System.out.println(Days.Friday);
                break;
            case 7:
                System.out.println(Days.Saturday);
                break;
            default:
                System.out.println(Days.Sunday);
                break;
            }
        }
    }

}