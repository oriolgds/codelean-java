package Figure;

public class Main {
    public static void perimeter(Figure f){
        System.out.println("The perimeter of a " + f.fname + " of base " + f.get_width() + " and " + f.get_height() + " is " + f.calculatePerimeter());
    }
    public static void area(Figure f){
        System.out.println("The area of a " + f.fname + " of base " + f.get_width() + " and " + f.get_height() + " is " + f.calculateArea());
    }
    public static void main(String[] args) {
        Triangle t = new Triangle(6, 3);
        Rectangle r = new Rectangle (6, 4);
        Circle c = new Circle (1, 1);
        perimeter(t);
        area(t);
        perimeter(r);
        area(r);
        perimeter(c);
        area(c);

    }
}
