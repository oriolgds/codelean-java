package Electrodomestic;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Electrodomestic {
    private double _basePrice;
    public double get_basePrice(){
        return _basePrice;
    }  public void set_basePrice(double price){
        this._basePrice = price;
    }
    private String _color;
    public String get_color(){
        return _color;
    } public void set_color(String color){
        this._color = color;
    }
    private char _energyConsumption;
    public char get_energyConsumption(){
        return _energyConsumption;
    } public void set_energyConsumption(char energyConsumption){
        this._energyConsumption = energyConsumption;
    }
    private double _weight;
    public double get_weight(){
        return _weight;
    } public void set_weight(double weight){
        this._weight = weight;
    }
    Electrodomestic(){
        super();
        _weight = 5;
        _energyConsumption = 'F';
        _color = "white";
        _basePrice = finalPrice(100);
    }
    Electrodomestic(double price, double weight){
        super();
        _weight = weight;
        _energyConsumption = 'F';
        _color = "white";
        _basePrice = price;
    }
    Electrodomestic(double price, String color, char energyConsumption, double weight){
        super();
        _weight = weight;
        _energyConsumption = this.checkEnergyConsumption(energyConsumption);
        _color = this.checkColor(color);
        _basePrice = price;
    }
    double finalPrice(double price){
        char l = this._energyConsumption;
        if(l == 'A'){
            price += 100;
        } else if(l == 'B'){
            price += 80;
        } else if(l == 'C'){
            price += 60;
        } else if(l == 'D'){
            price += 50;
        } else if(l == 'E'){
            price += 30;
        } else if(l == 'F'){
            price += 10;
        }
        if(this._weight > 0 && this._weight < 20){
            price += 10;
        } else if(this._weight >= 20 && this._weight < 50){
            price += 50;
        } else if(this._weight >= 50 && this._weight < 80){
            price += 80;
        } else if (this._weight > 80){
            price += 100;
        }
        return price;
    }
    // Methods
    char checkEnergyConsumption(char letter){
        // Check if it's a valid letter
        if(letter >= 'A' && letter <= 'F'){
            return letter;
        } else {
            return 'F';
        }
    }
    String checkColor(String color){
        String[] colorsArray = {"white", "black", "red", "blue", "grey"};
        List<String> colors = List.of(Arrays.toString(colorsArray));
        if(Objects.equals(color, "black") || Objects.equals(color, "red") || Objects.equals(color, "blue") || Objects.equals(color, "grey")){
            return color;
        } else {
            return "white";
        }
    }
    public String toString(){
        System.out.println("Price: " + this._basePrice);
        System.out.println("Color: " + this._color);
        System.out.println("EnergyConsumption: " + this._energyConsumption);
        System.out.println("Weight: " + this._weight);
        System.out.println("************************************************");
        return null;
    }
}
