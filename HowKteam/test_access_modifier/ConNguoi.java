package test_access_modifier;
class ConNguoi {
    // private String name;
    // private int age;
    // private float height;

    // private void showName() {
    //     System.out.println(this.name);
    // }
    // private int getAge() {
    //     return age;
    // }

// < Default
    // String name;
    // int age;
    // float height;

    // void showName() {
    //     System.out.println(this.name);
    // }
    // int getAge() {
    //     return age;
    // }

// > Protected
    protected String name;
    protected int age;
    protected float height;

    protected void showName() {
        System.out.println(this.name);
    }
    protected int getAge() {
        return age;
    }




}
