package Electrodomestic;

public class washingMachine extends Electrodomestic {
	private static double _load = 5;
	public double get_load(){
		return _load;
	} public void set_load(double load){
		_load = load;
	}
	washingMachine(){
		super();
		this._load = 5;
	}
	washingMachine(double price, double weight){
		super(price, weight);
		this._load = 5;

	}
	washingMachine(double price, double weight, char energyConsumption, String color){
		super(price, color, energyConsumption, weight);
		this._load = 5;

	}
	washingMachine(double price, String color, char energyConsumption, double weight, double load){
		super(price, color, energyConsumption, weight);
		_load = load;
	}
	double finalPrice(double price){
		price = super.finalPrice(price);
		if(_load >= 30){
			price += 50;
		}
		set_basePrice(price);
		return price;
	}
	public String toString(){
		System.out.println("Price: " + this.get_basePrice());
		System.out.println("Color: " + this.get_color());
		System.out.println("EnergyConsumption: " + this.get_energyConsumption());
		System.out.println("Weight: " + this.get_weight());
		System.out.println("Load: " + _load);
		System.out.println("************************************************");
		return null;
	}
}
