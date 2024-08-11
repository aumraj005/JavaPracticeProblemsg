import java.util.Scanner;
public class Inher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int teams = 0;
        while(m>0 && n>0 && m+n>=4){
            if(m>n){
                m = m-3;
                n = n-1;
            }else if(m==n){
                m =m-2;
                n= n-2;
            }
            else {
                m= m-1;
                n= n-3;
            }
            teams++;
        }
        System.out.println(teams);
    }
}