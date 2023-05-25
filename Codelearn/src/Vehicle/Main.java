package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car c = new Car ("Petrol", "CodeCar", 150);

        Motorbike m = new Motorbike ( 125, "CodeMoto");

        System.out.println (c.speedUp (150));

        System.out.println (m.speedUp (50));

        System.out.println (c.slowDown (30));

        System.out.println (m.slowDown (120));
    }
}
