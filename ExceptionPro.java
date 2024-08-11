import java.util.*;
public class ExceptionPro {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int mod(int a,int b){
        try{
            return a%b;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    public static int div(int a,int b){
        try{
            return a/b;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char s = sc.next().charAt(0);
        if(s == '+'){
            System.out.println(add(a, b));
        }
        else if(s == '-'){
            System.out.println(sub(a,b));
        } else if (s == '/') {
            System.out.println(div(a,b));
        }
        else if (s== '*'){
            System.out.println(mul(a,b));
        }
        else if (s == '%'){
            System.out.println(mod(a,b));
        }
        else {
            System.out.println("Enter a valid symbol");
        }
    }
}

