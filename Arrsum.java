import java.util.Scanner;

public class Arrsum {
    public static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] adi = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            adi[i] = sc.nextInt();
        }
        int ars = add(adi);
        System.out.println(ars);
    }
}