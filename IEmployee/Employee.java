public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
public class Entry {
    public static void main(String[] args) {
        IEmployee employee1 = new PartTimeEmployee("Thanh", 20000, 3);
        System.out.println("Tên " + employee1.getName());
        System.out.println("Lương mỗi ngày " + employee1.calculateSalary());

        IEmployee employee2 = new FullTimeEmployee("Quang", 12000);
        System.out.println("Tên " + employee2.getName());
        System.out.println("Lương mỗi ngày" + employee2.calculateSalary());
    }
}