package Toll;

public class Toll {
    Toll(){}
    public void chargeToll(Vehicle v){
        System.out.println("Charging toll");
        v.payToll();
    }
}
