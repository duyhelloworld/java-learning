// package Bro_Code;
// - Delete the above line to run

class Bike {
    String name;

    Bike(String name){
        this.name = name;
    }
}

class Garage {
    String garaname;
    public Garage(String garaname){
        this.garaname = garaname;
    }

    public void parking(Bike bike){
        System.out.println(bike.toString() + " is parking in the " + this.garaname);
    }
}



public class ObjectParsing {
    
    public static void main(String[] args) {
        Bike bicycle = new Bike("Sport Bycycle");
        Bike motorBike = new Bike("CBR");

        Garage garage1 = new Garage("garage Thanh Long");
        Garage garage2 = new Garage("garage Pham Duy");

        garage1.parking(bicycle);
        garage2.parking(motorBike);

    }
}
