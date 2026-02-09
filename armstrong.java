import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int orgnl = n;
        int sum = 0;

        while (n > 0) {
            int dgt = n % 10;
            sum = sum + dgt * dgt * dgt;
            n = n / 10;
        }
        if (sum == orgnl) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}