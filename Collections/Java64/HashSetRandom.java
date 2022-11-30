package Java64;

import java.util.Scanner;

public class HashSetRandom {
    public static void main(String[] args) {
        Box_Hash box_Hash = new Box_Hash();
        int selection = 0;
        do{
            System.out.println("______________________________");
            System.out.println("Enter your selection");
            System.out.println("1. Preview all code.");
            System.out.println("2. Check a prize code.");
            System.out.println("3. Add a new prize code.");
            System.out.println("4. Remove all prize code.");
            System.out.println("5. Remove a prize code.");
            System.out.println("6. Sweepstakes.");
            System.out.println("0. Exit.");
            try (Scanner scan = new Scanner(System.in)){
                selection = scan.nextInt();
                
            } catch (Exception e) {
                System.out.println("Error type");
            }
        } while (selection != 0);
    }
    

}   
