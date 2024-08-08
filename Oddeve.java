import java.util.Scanner;

public class Oddeve {
    public static String odd(int a){
        if (a%2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(odd(a));
    }
}
