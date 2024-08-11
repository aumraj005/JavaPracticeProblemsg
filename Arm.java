import java.util.Scanner;
public class Arm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        int r = 0;
        while (n > 0) {
            r = (int) (n % 10);
            n = (int) (n / 10);
            s += r * r * r*r;
        }
        System.out.println(s);
    }
}
