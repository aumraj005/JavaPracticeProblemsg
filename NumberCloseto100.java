import java.util.Scanner;
//import static java.lang.Math.abs;

public class NumberCloseto100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int ans = Math.abs(a-100);
        int ans1 = Math.abs(b-100);
        if(ans>ans1){
            System.out.println(b);
        }
        else if(ans<ans1){
            System.out.println(a);
        }
        else {
            System.out.println("Both Numbers are Equal");
        }
    }
}
