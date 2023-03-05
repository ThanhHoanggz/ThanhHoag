public class PizzaClient {
    public void run() {
        Pizza round = new Pizza(2.77, new Circle(2.5));
        Pizza rect = new Pizza(4.44, new Rectangle(2.0, 3.0));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round + " is a better deal than " + rect + ": " + pd.betterDeal(round, rect));
        System.out.println("Enjoy~");
    }

    public static void main(String[] args) {
        new PizzaClient().run();
    }
}
