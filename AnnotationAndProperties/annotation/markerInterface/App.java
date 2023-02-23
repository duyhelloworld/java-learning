package markerInterface;

public class App {
    public static void delete(Object obj) {
        if (obj instanceof SafeDeletable) {
            System.out.println("Deleted " + obj.getClass().getCanonicalName() + "safe!");
        }
        else {
            throw new SecurityException("Error at delete this user : " + obj.getClass().getSimpleName());
        }
    }
    public static void main(String[] args) {
        delete(new AllowedMan());
        delete(new NotAllowedMan());
    }    
}
