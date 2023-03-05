public class Circle implements IShape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
