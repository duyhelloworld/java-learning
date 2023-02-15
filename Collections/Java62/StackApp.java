package Java62;

import java.util.Scanner;
import java.util.Stack;

public class StackApp {
/*
 * 3 main method of stack
 * - Push() : add to stack
 * - Pop() : delete the top and return it value
 * - Peek() : get without delete top
 * 
 * - clear()
 * - contains(Object value)
 * - isEmpty()
 * @author duypham
*/

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Stack<String> stack_str = new Stack<String>();
            
            System.out.println("Enter value : ");
            String value = scan.nextLine();
            int Vsize = value.length();
            for (int index = 0; index < Vsize; index++) {
                // stack_str.push(value.charAt(index));
                // truyền vào Char nên báo lỗi

                // Sủa = + 1 chuỗi rỗng
                stack_str.push(value.charAt(index) + "");
            }
            System.out.println("Your reserved string is : ");
            for (int index = 0; index < Vsize; index++) {
                System.out.print(stack_str.pop());
            }
            System.out.println();
        }
    }
}
