package Vehicle;

public class Car implements Vehicle {
    private int speed;
    private final String type;
    private final String model;
    private final int power;
    @Override
    public String slowDown(int quantity) {
        this.speed -= quantity;
        if(this.speed < 0){
            this.speed = 0;
        }
        return "The car has slowed down and its current speed is " + this.speed + " km / h.";
    }

    @Override
    public String speedUp(int quantity) {
        this.speed += quantity;
        if(this.speed > maxSpeed){
            this.speed = maxSpeed;
        }
        return "The car has speed up and its current speed is " + this.speed + " km / h.";
    }
    Car(String type, String model, int power){
        this.type = type;
        this.model = model;
        this.power = power;
        this.speed = 0;
    }
}
