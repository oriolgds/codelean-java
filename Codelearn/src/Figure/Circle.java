package Figure;

public class Circle extends Figure {
    @Override
    public String fname(){
        return "circle";
    }
    Circle(double height, double width){
        super(height, width);
    }

    @Override
    public double calculatePerimeter() {
        if(this.get_height() != this.get_width()){
            return 0.0f;
        }
        return 2 * 3.1415 * this.get_width();
    }
    @Override
    public double calculateArea() {
        if(this.get_height() != this.get_width()){
            return 0.0f;
        }
        return 3.1415 * get_width() * get_width();
    }
}
