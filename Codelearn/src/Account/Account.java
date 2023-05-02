package Account;

public class Account {
    private final String _owner;
    private double _amount;

    public Account(String owner) {
        _owner = owner;
        _amount = 0;
    }

    public Account(String owner, int amount) {
        _owner = owner;
        _amount = amount;

    }
    public void deposit(int amount) {
        _amount += amount;
    }
    public void withdrawal(int amount) {
        _amount -= amount;
    }
    public String toString(){

        return _owner + " of the current account has " + _amount;
    }
}