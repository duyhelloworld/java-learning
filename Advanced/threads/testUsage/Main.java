package threads.testUsage;

public class Main {
    public static void main(String[] args) {
        LoadText loader = new LoadText();
        loader.run();
        try {
            loader.wait(5000);
            System.out.println("Loader stoped 1000ms.");
            // loader.notify();
            // System.out.println("Notify --> Continue running.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Close loader.");
    }
}
