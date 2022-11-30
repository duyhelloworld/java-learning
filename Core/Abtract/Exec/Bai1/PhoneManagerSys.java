package Abtract.Exec.Bai1;
import java.util.ArrayList;
import java.util.Scanner;
// import java.io.*;
public class PhoneManagerSys {
    public static void main(String[] args) {


        // Hard data
        ArrayList<String> strName = new ArrayList<String>(){{add("Pham A"); add("Le B"); add("Nguyen C"); add("Dao D");}};
        ArrayList<String> strPhone = new ArrayList<String>(){{add("9020034243"); add("123"); add("040453524"); add("012345678");}};


        PhoneBook phonebooks = new PhoneBook(strName, strPhone);
        phonebooks.setDefaultUser(4);

        Scanner scan = new Scanner(System.in);
        System.out.println("PhoneNumber Management System");
        String[] requests = new String[] {"Insert phone", "Add new phone", "Delete phone", "Update phone", "Search phone"};
        for (int i = 0; i < requests.length; i++) {
            System.out.println(i+1 + ".\t" + requests[i]);
        }
        System.out.print("Enter your choice : ");
        int userModeSelection = scan.nextInt();

        switch (userModeSelection) {
            case 1:
                System.out.print("Enter name : ");
                String name = scan.next();
                System.out.flush();
                // System.out.print("Enter phone : ");
                String phone = scan.next();
                phonebooks.insertPhone(name, phone);
                phonebooks.showAllInfo();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
