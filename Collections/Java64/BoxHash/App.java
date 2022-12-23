package Java64.BoxHash;
import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
        int selection = 0;
        try (Scanner scan = new Scanner(System.in)){
            BoxHash boxHash = new BoxHash();
            boxHash.setLengthCode(7);
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
                selection = scan.nextInt();
                
                switch (selection) {
                    case 1:
                        boxHash.showAllCodeInBox();
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        System.out.println("Please enter a code :");
                        String input = scan.nextLine();

                        while (!boxHash.checkLengthCode(input)) {
                            System.out.println("Enter again (code length is 7) : ");
                            input = scan.nextLine();
                        }

                        if (selection == 3) {
                            System.out.println("Them "
                            + (boxHash.addCode(input) ? "thanh cong." : "that bai. Code existed!"));
                        } else if (selection == 2) {
                            System.out.println("Check code : " + (boxHash.searchCode(input) ? "Existed" : "Not exist"));
                        } else if (selection == 5) {
                            System.out.println("Remove code : " + (boxHash.removeCode(input) ? " success" : " fail"));
                        } else {
                            // Sweepstakes
                            if (boxHash.size() == 0) {
                                System.out.println("Box is empty");
                                break;
                            } else{
                                int record = boxHash.sweepstakes();
                                if (record > 3) {
                                    System.out.println("No, you\' not success");
                                } else {
                                    System.out.println("You just got the award " + record);
                                    break;
                                }
                            }
                        }
                        break;
                    
                    case 4:
                        System.out.println("Clearing...");
                        boxHash.clearAll();
                        boxHash.showAllCodeInBox();
                        break;                        
                        
                    default:
                        break;
                }
                
            } while (selection != 0);
        } catch (Exception e) {
            System.out.println("Error type");
        }
    }
}
