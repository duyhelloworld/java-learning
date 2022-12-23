package Java62;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBin {
    public static void main(String[] args) throws NoClassDefFoundError{
        try (Scanner scan = new Scanner(System.in)) {
            Stack<Integer> result = new Stack<Integer>();
            System.out.println("Enter your decimal number : ");
            int decimal = scan.nextInt();
            while (decimal > 0) {

                int rest = decimal % 2;
                result.push(rest);
                decimal = decimal / 2; // surplus
            }
            System.out.println("Result is : ");
            int rs_size = result.size();
            for (int i = 0; i < rs_size; i++) {
                System.out.print("\t" + result.pop());
            }
            System.out.println();
            System.out.println("Enter your decimal number : ");
            // int decimal = scan.nextInt();
            // Stack<Integer> result = new Stack<Integer>();
            int rest, surplus;
            do {
                rest = decimal % 2;
                surplus = decimal / 2;
                result.push(rest);
                decimal = surplus;
                // rest = decimal % 2;
            } while (decimal > 0);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.pop());
            }
        } catch (Exception e) {
            System.out.println("You enter wrong value");
        }
    }
}
