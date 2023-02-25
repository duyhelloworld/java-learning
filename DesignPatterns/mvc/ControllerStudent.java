import java.time.LocalDate;

public class ControllerStudent {
    private ModelStudent model;
    private ViewStudent view;

    public void initial() {
        model = new ModelStudent(1L, "unknown", LocalDate.now());
        view = new ViewStudent();
    }

    public void showDetail() {
        view.showDetailPage(model);
    }

    public void rename(String newName) {
        model.setName(newName);
    }

    // ...

    public void save() {
        boolean isSuccess = model.save();
        if (isSuccess) {
            view.showUpdatedPage(model);
        } else {
            view.showErrorMessage(404);
        }
    }
}
