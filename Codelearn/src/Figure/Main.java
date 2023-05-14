package Figure;

public class Main {
    public static void perimeter(Figure f){
        System.out.println("The perimeter of a " + f.fname() + " of base " + f.get_width() + " and height " + f.get_height() + " is " + f.calculatePerimeter());
    }
    public static void area(Figure f){
        System.out.println("The area of a " + f.fname() + " of base " + f.get_width() + " and height " + f.get_height() + " is " + f.calculateArea());
    }
    public static void perimeterC(Circle circle){
        System.out.println("The perimeter of a " + circle.fname() + " of radius " + circle.get_width() + " is " + circle.calculatePerimeter());
    }
    public static void areaC(Circle circle){
        System.out.println("The area of a " + circle.fname() + " of radius " + circle.get_width() + " is " + circle.calculateArea());
    }
    public static void main(String[] args) {
        Triangle t = new Triangle(6, 3);
        Rectangle r = new Rectangle (6, 4);
        Circle c = new Circle (1, 1);
        perimeter(t);
        area(t);
        perimeter(r);
        area(r);
        perimeterC(c);
        areaC(c);

    }
}
