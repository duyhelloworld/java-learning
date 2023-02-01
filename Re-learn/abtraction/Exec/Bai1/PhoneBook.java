package abtraction.Exec.Bai1;
// import java.io.*;
import java.util.ArrayList;

public class PhoneBook implements Phone{

    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> phones = new ArrayList<String>();
    private int numberOfDefaultUser;

    public PhoneBook(ArrayList<String> names, ArrayList<String> phones){
        this.phones = phones;
        this.names = names;
    };
    public PhoneBook(){};
// getter & setter

    public int getNumberOfUser() {
        return this.numberOfDefaultUser;
    }

    public boolean setDefaultUser(int number){
        if (number >= 1) {
        this.numberOfDefaultUser = number;
        return true;
        }
        return false;
    }

    public ArrayList<String> getNames() {
        return this.names;
    }
    public ArrayList<String> getPhones() {
        return this.phones;
    }

    public void showAllInfo(){
        for (int i = 0; i < numberOfDefaultUser; i++) {
            System.out.println(i+1 + "\t" + this.getNames() + "\t" + this.getPhones());
        }
    }

    // public void setNames(ArrayList<String> names) {
    //     this.names = names;
    // }
    // public void setPhones(ArrayList<String> phones) {
    //     this.phones = phones;
    // }

    @Override
    public void removePhone(String name, String phone) {

        /**
         * * Loop upto when name(List) == name(input)
         *                               -> check phone -> 
         *                                              -> break/delete
         */
        for (int i = 0; i < this.numberOfDefaultUser; i++) {
            if (names.get(i) == name) {
                if (phones.get(i) == phone) {
                    phones.remove(i);
                    names.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < numberOfDefaultUser; i++) {
            if (names.get(i) == name) {
                if (phones.get(i) != phone) {
                    phones.add(i, phone);
                    break;
                }
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (int i = 0; i < numberOfDefaultUser; i++) {
            if (names.get(i) == newphone) {
                names.set(i, newphone);
                break;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (int i = 0; i < numberOfDefaultUser; i++) {
            if (names.get(i) == name) {
                System.out.println("Number phone of user " + name + " : " + phones.get(i));
                break;
            }
        }
    }

    @Override
    public void sortPhone() {
    }
  
}
    // FileInputStream in = null;
    // FileOutputStream out = null;

    // try {
    //     in = new FileInputStream("userAgent.txt");
    //     out = new FileOutputStream("userAgent_Updated.txt");
    //     int loader = in.read();
    //     while(loader != 1 ){
    //         out.write(loader);
    //     };

    // } catch (Exception e) {
    //     System.out.println("Error, let check again!");
    // }