import java.time.format.DateTimeFormatter;

public class ViewStudent {
    public void showHome() {
        System.out.println("Home page of Application.");
    }

    public void showDetailPage(ModelStudent student) {
        System.out.println("Student: ");
        System.out.println("+ Id: " + student.getId());
        System.out.println("+ Name: " + student.getName());
        System.out.println("+ Updated date: " +
                student.getUpdatedDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("---------------------------");
    }

    public void showUpdatedPage(ModelStudent student) {
        System.out.println("Saved ID(" + student.getId() + ") successfully");
        showDetailPage(student);
    }

    public void showErrorMessage(int codeHttp) {
        System.out.println("Something wrong!!!\nError code : " + codeHttp);
    }
}
