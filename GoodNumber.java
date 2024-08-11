import java.util.Scanner;
public class GoodNumber {
    public static boolean Good(int n) {
        int n1 = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += fact(digit);
            n /= 10;
        }
        return sum == n1;
    }
    private static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (Good(n)) {
            System.out.println("Good Number");
        } else {
            System.out.println("Not a Good Number");
        }
    }
}