package Celular;

public class Smartphone extends Celular {
    private double _pixelsCamera;

    public double get_pixelsCamera() {
        return _pixelsCamera;
    }

    public void set_pixelsCamera(double _pixelsCamera) {
        this._pixelsCamera = _pixelsCamera;
    }
    private double _ram;

    public double get_ram() {
        return _ram;
    }

    public void set_ram(double _ram) {
        this._ram = _ram;
    }
    private double _diskSpace;

    public double get_diskSpace() {
        return _diskSpace;
    }

    public void set_diskSpace(double _diskSpace) {
        this._diskSpace = _diskSpace;
    }
    Smartphone(){}
    Smartphone(String color, String model, String brand, double pixelsCamera, double ram, double diskSpace){
        super(color, model, brand);
        this._pixelsCamera = pixelsCamera;
        this._ram = ram;
        this._diskSpace = diskSpace;
    }

    public String toString() {
        super.toString();
        System.out.println("Smartphone Camera: " + _pixelsCamera);
        System.out.println("Smartphone ram: " + _ram);
        System.out.println("Smartphone Disk Space: " + _diskSpace);
        return null;
    }
}
