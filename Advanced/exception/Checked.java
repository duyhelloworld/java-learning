package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Checked extends Throwable {
    // IOException, SQLException, ...
    public static void main(String[] args) throws Exception {
        System.out.println("Loading...");
        FileReader file = new FileReader("./hello.txt");
        BufferedReader rd = new BufferedReader(file);
        
        // > If exception occurs, exception will be thrown at runtime and not be handled.
        
        // ! File not found --> skip below lines
        System.out.println("Completed");
        System.out.println(rd.readLine());
    }
}
