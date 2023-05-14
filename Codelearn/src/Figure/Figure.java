package Figure;

public abstract class Figure {
    public String fname = "figure";
    public double get_height() {
        return _height;
    }

    public void set_height(double _height) {
        this._height = _height;
    }

    public double get_width() {
        return _width;
    }

    public void set_width(double _width) {
        this._width = _width;
    }

    private double _height;
    private double _width;
    Figure(double _height, double _width){
        super();
        this._height = _height;
        this._width = _width;
    }
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
