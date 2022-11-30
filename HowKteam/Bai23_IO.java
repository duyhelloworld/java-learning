// > Lib
import java.io.*;

public class Bai23_IO {
    
    public static void main(String[] args){
        
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt"); 
            int load;
            while ((load = in.read()) != -1) {
                out.write(load);
            }
        } catch (Exception e) {
            System.out.println("Show Except : " + e);
        }

    }
}
