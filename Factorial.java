public class Factorial {
    public static int fact(int n){
        int sum = 1;
        if(n>0){
            sum = n * fact(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
