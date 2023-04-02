package annotation.RepeatingAnno;

public class Alert {
    @Schedule(dayOfMonth = "last")
    @Schedule(dateOfWeek = "Fri", hour = 13)
    public void doCleanup() {
        System.out.println("Clean up System...");
    }
}
