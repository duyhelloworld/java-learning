package threads.testUsage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadText implements Runnable {
    @Override
    public void run() {
        File fileImage = new File("lorem.txt");
        try (FileReader reader = new FileReader(fileImage)) {
            System.out.println("Image encoding " + reader.getEncoding());
            System.out.println("Path : " + File.listRoots().toString());
            System.out.println("Content :\n" + reader.toString());
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }    
}
