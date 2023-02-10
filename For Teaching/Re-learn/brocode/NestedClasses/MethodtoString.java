package NestedClasses;
class Bike{
    String name = "Kawasaki";
    String color = "red, black";
    int year = 2020;


    public String toString(){
        String declare = name + " has color " + color + " and was made in " + year;
        return declare;
    }
}
public class MethodtoString {
    public static void main(String[] args) {
        
        Bike myBike = new Bike();

        System.out.println(myBike.name);
        System.out.println(myBike.year);
        System.out.println(myBike.color);

        // > We need to print myBike like above, but
        System.out.println(myBike);
        // --> return the allocation of Object myBike in memory;
        
        // --> Method toString();
        System.out.println(myBike.toString());
        // > return address
        System.out.println(myBike);

        // > If want to return value --> definition toString method
        // String h = "test";
        // String[] h = {" ","123" , "asd"};
        // int[] h = {1, 2, 3, 4};
        // System.out.println(h.toString());
        // ! toString use for : Object, String, Array
        // ! not for          : class, primitive data-type
    }

}
