import java.util.Scanner;

public class YearsandMonths {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        int a= 799;
        int years =  a/360;
        a = a-360*(years);
        int months = a/30;
        a = a-30*(months);
        int weeks = a/6;
        a =a-6*(weeks);
        int days = a;
        System.out.println(years +"Years");
        System.out.println(months + "Months");
        System.out.println(weeks+ "Weeks");
        System.out.println(days + "Days");
    }
}