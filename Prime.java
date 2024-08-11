import java.util.Scanner;

public class Prime {
    public static String pr(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return "Prime";
        } else {
            return "Not Prime ";
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pr(n));
    }
}
