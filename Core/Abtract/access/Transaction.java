package Abtract.access;

/**
 * Transaction
 */
public class Transaction {
    // !  Infringe the abtract principle
    public double fee = 001;
    // double fee = 0.01;
    // protected double fee = 0.01;
    public void changeFee(double newFee){
        this.fee = newFee;
    }
    
    // ! Follow the abtract principle
    // private double fee = 0.01;
    public double getFee() {
        return fee;
    }

    public void printFee(){
        System.out.println(this.fee);
    }
}