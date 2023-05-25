package Vehicle;

public class Motorbike implements Vehicle {
    private int speed;
    private int engineCapacity;
    private String model;
    @Override
    public String slowDown(int quantity) {
        this.speed -= quantity;
        if(this.speed < 0){
            this.speed = 0;
        }
        return "The motorbike has slowed down and its current speed is " + this.speed + " km / h.";
    }

    @Override
    public String speedUp(int quantity) {
        this.speed += quantity;
        if(this.speed > maxSpeed){
            this.speed = maxSpeed;
        }
        return "The motorbike has speed up and its current speed is " + this.speed + " km / h.";
    }
    Motorbike(int engineCapacity, String model){
        this.engineCapacity = engineCapacity;
        this.model = model;
    }
}
