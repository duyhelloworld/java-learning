import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ZoomGetLucky {
    static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static Scanner scan = new Scanner(System.in);
    static int limit = 0;
    static List<Integer> result = new ArrayList<Integer>();



    static void AppRunner(int limit) {
        System.out.println("What is your mode?");
        System.out.println("\t\t\t1. Scan a number");
        System.out.println("\t\t\t2. Zoom");
        int selection;
        try {
            selection = scan.nextInt();
            switch (selection) {
                case 1: // Scan mode

                    System.out.println("What is your choosen number? (Range is 1 -> 10)");
                    int user = scan.nextInt();
                    // int bot = (int) Math.random() * 11;
                    int bot = 4;

                    if (user != bot) {
                        System.out.println("Oh, you are wrong.");
                        result.add(user);
                    } else {
                        System.out.println("Good, you beated me!");
                    }
                    if (limit == 3) {
                        System.out.println("Timeout.\nYour Result");
                        for (Integer numberResult : result) {
                            System.out.println(numberResult);
                        }
                    }
                    System.out.println("Game exiting .....");
                    break;

                case 2: // Zoom mode
                    int zoomTurn = 5;
                    int maxBot = 10, minBot = 0;
                    Random rand = new Random();
                    clearTerminal();
                    System.out.println("You entered zoom mode! Now you have " + zoomTurn + " turns");
                    for (int i = 0; i < zoomTurn; i++) {
                        System.out.print("Press enter to continue");
                        String enter = scan.next();
                        if (enter == "") {
                            int bot1 = (int) (Math.random() * (maxBot - minBot) + minBot);
                            int bot2 = rand.nextInt(maxBot - minBot) + minBot;

                            if (bot1 != bot2) {
                                System.out.println("Failure! Bot1 is " + bot1 + "; Bot2 is " + bot2);
                            } else {
                                System.out.println("Success! You beated me!");
                                break;
                            }
                        }
                        System.out.println("Now you have " + i + 1 + " turns");
                    }
                    break;
                default:
                    System.out.println("Nhap nham roi");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Wrong request");
        }
    }

    public static void main(String[] args) {
        AppRunner(limit);
    }

}
