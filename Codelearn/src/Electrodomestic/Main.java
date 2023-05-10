package Electrodomestic;

public class Main {
    public static void main(String[] args) {
        Electrodomestic elec1 = new Electrodomestic();
        elec1.toString();
        Electrodomestic elec2 = new Electrodomestic(190.0, 50.0);
        elec2.toString();
        Electrodomestic elec3 = new Electrodomestic(280.0, "black", 'D', 70.0);
        elec3.toString();

        washingMachine wm1 = new washingMachine(120.0, 5.0);
        wm1.toString();
        washingMachine wm2 = new washingMachine(310.0, 100.0);
        wm2.toString();
        washingMachine wm3 = new washingMachine(350.0, "grey", 'A', 100.0, 20.0);
        wm3.toString();
    }
}
