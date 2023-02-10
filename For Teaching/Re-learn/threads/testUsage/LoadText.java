package threads.testUsage;

public class LoadText implements Runnable {
    @Override
    public void run() {
        // File fileImage = new File("lorem.txt");
        // try (FileReader reader = new FileReader(fileImage)) {
        //     System.out.println("Image encoding " + reader.getEncoding());
        //     System.out.println("Path : " + File.listRoots().toString());
        //     System.out.println("Content :\n" + reader.toString());
        // } catch (IOException e) {
        //     System.out.println(e.getLocalizedMessage());
        // }
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }
}
