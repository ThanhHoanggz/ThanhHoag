
import java.util.Scanner;
public class tinhtongcacchuso {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập số ");
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
            System.out.println("Tong cac chu so : " + sum );
            System.out.println("Enjoy~");
        }
    }
