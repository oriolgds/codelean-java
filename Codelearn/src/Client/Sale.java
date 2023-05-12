package Client;

public class Sale {
    public int get_invoice() {
        return _invoice;
    }

    public void set_invoice(int _invoice) {
        this._invoice = _invoice;
    }

    public String get_date() {
        return _date;
    }

    public void set_date(String _date) {
        this._date = _date;
    }

    public Client get_client() {
        return _client;
    }

    public void set_client(Client _client) {
        this._client = _client;
    }

    public Product get_product() {
        return _product;
    }

    public void set_product(Product _product) {
        this._product = _product;
    }

    public int get_quantity() {
        return _quantity;
    }

    public void set_quantity(int _quantity) {
        this._quantity = _quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private int _invoice;
    private String _date;
    private Client _client;
    private Product _product;
    private int _quantity;
    private double totalAmount;

    public Sale(int _invoice, String _date, Client _client, Product _product, int _quantity){
        this._invoice = _invoice;
        this._date = _date;
        this._client = _client;
        this._product = _product;
        this._quantity = _quantity;
    }
    public double calculateAmount(){
        return this._quantity * _product.get_price();
    }
    public String toString(){
        System.out.println("Invoice data:");
        System.out.println("-------------");
        System.out.println("Number: " + this._product.get_number());
        System.out.println("Date: " + this._date);
        System.out.println("Client name: " + this._client.get_name());
        System.out.println("Product name: " + this._product.get_name());
        System.out.println("Total amount: " + calculateAmount());
        return null;
    }
}
