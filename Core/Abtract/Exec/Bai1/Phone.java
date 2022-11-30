package Abtract.Exec.Bai1;

public interface Phone {
    public abstract void removePhone(String name, String phone);

    public abstract void insertPhone(String name, String phone);

    public abstract void updatePhone(String name, String phone);

    public abstract void searchPhone(String name);

    public abstract void sortPhone();
}
