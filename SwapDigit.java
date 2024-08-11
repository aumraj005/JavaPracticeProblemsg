import java.util.Scanner;

public class SwapDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int z = k;
        int n =0;
        while (z>0){
            z= z/10;
            n++;
        }
        int ld = k %10;
        int fd = (int)(k/Math.pow(10,n-1));
        k = (k/10)*10 + fd;
        int temp = (int) (k%Math.pow(10,n-1));
        int ans = (int) (ld*Math.pow(10,n-1)+ temp);
        System.out.println(ans);
    }
}
