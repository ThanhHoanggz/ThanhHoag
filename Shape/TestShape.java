public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5, "blue", true);
        System.out.println("A circle have Area: " + s1.getArea() + " and color: " + s1.getColor() + " and fill: " + s1.isFilled());

        Shape s2 = new Rectangle(4, 6, "red", false);
        System.out.println("A rectangle have Area: " + s2.getArea() + " and color: " + s2.getColor() + " and fill: " + s2.isFilled());

        Shape s3 = new Square(4, "green", true);
        System.out.println("A square have Area: " + s3.getArea() + " and color: " + s3.getColor() + " and fill: " + s3.isFilled());
    }
}
