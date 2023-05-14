package Figure;

public class Rectangle extends Figure {
    @Override
    public String fname(){
        return "rectangle";
    }
    Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public double calculatePerimeter() {
        return this.get_height() * 2 + this.get_width() * 2;
    }
    @Override
    public double calculateArea() {
        return this.get_height() * this.get_width();
    }
}
