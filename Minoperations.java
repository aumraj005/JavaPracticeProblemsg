import java.util.Scanner;

public class Minoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 4){
            System.out.println(a-1);
        }
        else if(a%2 == 0){
            System.out.println('2');
        }
        else {
            System.out.println('3');
        }
    }
}
