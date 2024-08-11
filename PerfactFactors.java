
import java.util.Scanner;
public class PerfactFactors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        for (int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                a += i;
            }
        }
        if(a == n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println(a);
        }
    }
}
