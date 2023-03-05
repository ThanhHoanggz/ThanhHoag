public class Rectangle implements IShape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double getArea() {
        return width * height;
    }
}
