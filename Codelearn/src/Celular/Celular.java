package Celular;

public class Celular {
    private String _color;

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    private String _model;

    public String get_brand() {
        return _brand;
    }

    public void set_brand(String _brand) {
        this._brand = _brand;
    }

    public String get_model() {
        return _model;
    }

    public void set_model(String _model) {
        this._model = _model;
    }

    private String _brand;
    Celular(){}
    Celular(String color, String model, String brand){
        super();
        this._brand = brand;
        this._color = color;
        this._model = model;
    }
    public void call(String name){
        System.out.println("Calling " + name);
    }
    public void endCall(){
        System.out.println("Call finished");
    }
    public String toString(){
        System.out.println("Phone Brand: " + this._brand);
        System.out.println("Phone model: " + this._model);
        System.out.println("Phone Color: " + this._color);

        return null;
    }
}
