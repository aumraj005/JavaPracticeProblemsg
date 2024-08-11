import java.util.Scanner;
public class Poweroftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>1){
            if(n%2!=0){
                break;
            }
            n = n/2;
        }
        if(n == 1){
            System.out.println("Power of 2");
        }
        else {
            System.out.println("Not a power of 2");
        }
//        for (int i = 0; i <= n; i++) {
//            if ((int) Math.pow(2,i) == n){
//                System.out.println("True");
//            }
//            else{
//                System.out.println("False");
//            }
//        }
    }
}


// 32 -> 100000(2**n)
// 31 -> 011111(2**n -1)
//  & -> 000000 -> 0

