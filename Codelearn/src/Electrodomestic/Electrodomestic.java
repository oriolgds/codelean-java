package Electrodomestic;

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
        _basePrice = 100;
        _weight = 5;
        _energyConsumption = 'F';
        _color = "white";
    }
    Electrodomestic(double price, double weight){
        _basePrice = price;
        _weight = weight;
        _energyConsumption = 'F';
        _color = "white";
    }
    Electrodomestic(double price, double weight, char energyConsumption, String color){
        _basePrice = price;
        _weight = weight;
        _energyConsumption = energyConsumption;
        _color = color;
    }
}
