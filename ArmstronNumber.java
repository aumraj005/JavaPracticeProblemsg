import java.util.Scanner;
public class ArmstronNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int s = 0;
            int r = 0;
            int temp = n;
            while (n > 0) {
                r =  n % 10;
                n =  n / 10;
                s += r * r * r;
            }
            if (temp == s) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
