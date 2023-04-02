package threads.usageCorrect;

public class Task1_1 {
    public void runTask() {
        for (int i = 0; i < 15; i++) {
            System.out.println("**** " + this.getClass().getName() + "print #" + (i+1));
        }
    }
}
