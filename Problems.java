import java.util.Scanner;

public class Problems {
    public static String value(int a) {
        if ((a % 2 == 0) && (a % 5 == 0)) {
            return "Type1";
        }
        else if (a % 2 == 0)  {
                return "Type2";
        }
        else if (a % 5 == 0) {
            return "Type3";
        }
        else {
            return "Type4";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(value(a));
    }
}