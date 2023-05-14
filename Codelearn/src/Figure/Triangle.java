package Figure;

public class Triangle extends Figure {
    @Override
    public String fname(){
        return "triangle";
    }
    Triangle(double height, double width){
        super(height, width);
    }

    @Override
    public double calculatePerimeter() {
        return this.get_width() * 3;
    }
    @Override
    public double calculateArea() {
        return this.get_height() * this.get_width() / 2;
    }
}
