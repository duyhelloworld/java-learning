package threads;

public class MultiThreadss implements Runnable {

    @Override
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        MultiThreadss threads = new MultiThreadss();
        threads.run(); 
    }
    
}
