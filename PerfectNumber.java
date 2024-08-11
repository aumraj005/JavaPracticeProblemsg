import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.println("Enter a number");
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i*i<=b ; i++) {
            count++;
        }
        System.out.println(count);
        for (int j = 1; j*j<=b; j++) {
            System.out.print( j*j+" ");
        }
    }
}

