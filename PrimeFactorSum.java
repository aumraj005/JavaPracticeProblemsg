import java.util.Scanner;

public class PrimeFactorSum {
    public static int Prime(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        if (n > 2) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Prime(n));
    }
}