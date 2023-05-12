package Client;

public class Main {
    public static void main(String[] args) {
        Client c = new Client (1234, "Codelearn", "Somewhere Over the Rainbow Boulevard", "555-123-123");

        Product p = new Product (10, "Laptop", "1200", "19", 19, "A laptop description", 1200);

        Sale s = new Sale (100, "01/01/2001", c, p, 10);
        s.toString();
    }
}
