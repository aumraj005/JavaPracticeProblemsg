import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n%i == 0) {
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a Prime ");
        }
    }
}