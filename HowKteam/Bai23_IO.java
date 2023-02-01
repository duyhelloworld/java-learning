// > Lib
// java.io.*

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bai23_IO {
    
    public static void main(String[] args) throws IOException{
        
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int load;
            while ((load = in.read()) != -1) {
                out.write(load);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Show Exception : " + e);
        }

    }
}
