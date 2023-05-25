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
        return null;
    }

    @Override
    public String speedUp(int quantity) {
        this.speed += quantity;
        if(this.speed > maxSpeed){
            this.speed = maxSpeed;
        }
        return null;
    }
    Motorbike(){

    }
}
