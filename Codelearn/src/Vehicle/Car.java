package Vehicle;

public class Car implements Vehicle {
    private int speed;
    private String type;
    private String model;
    private int power;
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
    Car(String type, String model, int power){
        this.type = type;
        this.model = model;
        this.power = power;
        this.speed = 0;
    }
}
