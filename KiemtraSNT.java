import java.util.Scanner;
public class KiemtraSNT {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập số nguyên tố");
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        boolean snt = true;
        if (n < 2){
            System.out.println("Không phải là số nguyên tố");
        }
        if (n >= 2) {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    snt = false;
                    break;
                }
            }
            if (snt == true) {
                System.out.println("Là số nguyên tố");
            } else {
                System.out.println("Không phải là số nguyên tố");
                System.out.println("Enjoy~");
            }
        }
    }
}
