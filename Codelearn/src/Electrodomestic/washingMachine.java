package Electrodomestic;

public class washingMachine extends Electrodomestic {
	washingMachine(){
		super();
	}
	washingMachine(double price, double weight){
		super(price, weight);
	}
	washingMachine(double price, double weight, char energyConsumption, String color){
		super(price, weight, energyConsumption, color);
	}

}
