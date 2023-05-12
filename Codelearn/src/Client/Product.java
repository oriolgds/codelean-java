package Client;

public class Product extends Client {
    public int get_code() {
        return _code;
    }

    public void set_code(int _code) {
        this._code = _code;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    private int _code;
    private String _description;
    private double _price;
    Product(int number, String name, String address, String phone, int code, String description, double price) {
        super(number, name, address, phone);
        this._code = code;
        this._description = description;
        this._price = price;

    }
}
