package Toll;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle ();
        Bus b = new Bus ();
        Car c = new Car ();
        Motorbike m = new Motorbike ();
        Truck t = new Truck ();
        Toll toll = new Toll ();
        toll.chargeToll(v);
        toll.chargeToll(b);
        toll.chargeToll(c);
        toll.chargeToll(m);
        toll.chargeToll(t);
    }
}
