import java.time.LocalDate;

public class ModelStudent {
    private Long id;
    private String name;
    private LocalDate updatedDate;

    public boolean save() {
        if (name.length() <= 10) {
            this.updatedDate = LocalDate.now();
            return true;
        }
        return false;
    }

    public ModelStudent() {
    }

    public ModelStudent(Long id, String name, LocalDate updatedDate) {
        this.id = id;
        this.name = name;
        this.updatedDate = updatedDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }
}
