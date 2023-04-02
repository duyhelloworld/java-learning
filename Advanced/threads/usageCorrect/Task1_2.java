package threads.usageCorrect;

// public class Task1_2 extends Thread {

public class Task1_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("@@@@ " + this.getClass().getName() + " print #" + (i + 1));
        }
    }
}
