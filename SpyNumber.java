public class SpyNumber {
    public static void main(String[] args) {
        int a = 123;
        int sum = 0;
        int prod = 1;
        int num = a;
        while (num > 0) {
            int digit = num % 10;
            sum = sum+ digit;
            prod =prod*digit;
            num =num/10;
        }
        if (sum == prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}