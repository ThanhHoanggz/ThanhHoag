public class PizzaDeal {
    public double deal(Pizza p) {
        return p.getPrice() / p.getShape().getArea();
    }

    public boolean betterDeal(Pizza p1, Pizza p2) {
        return deal(p1) < deal(p2);
    }

    @Override
    public String toString() {
        return "PizzaDeal";
    }
}
