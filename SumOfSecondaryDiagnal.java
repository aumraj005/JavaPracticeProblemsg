import java.util.Scanner;

public class SumOfSecondaryDiagnal {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc= new Scanner(System.in);
        int n =  sc.nextInt();
        int m  = sc.nextInt();
        int [][] arr = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr [i] [j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i+j== (n-1)) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
