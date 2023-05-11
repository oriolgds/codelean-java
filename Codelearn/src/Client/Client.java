package Client;

public class Client {
    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_number(int _number) {
        this._number = _number;
    }

    public int get_number() {
        return _number;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_address() {
        return _address;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    private int _number;
    private String _name;
    private String _address;
    private String _phone;
    Client(int number, String name, String address, String phone){
        this._name = name;
        this._number = number;
        this._address = address;
        this._phone = phone;
    }

}
