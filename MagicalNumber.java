import java.util.Scanner;

public class MagicalNumber {
    public static boolean magic_number(int a){
        int sum_digit = 0;
        int rem = 0;
        while (a>0){
            rem = a%2;
            sum_digit += rem+1;
            a= a/2;
        }
        if (sum_digit %2 != 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if (magic_number(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
