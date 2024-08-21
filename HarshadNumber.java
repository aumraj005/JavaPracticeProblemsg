public class HarshadNumber {
    public static void main(String[] args) {
        int a = 63;
        int sum =0;
        int temp = a;
        while (a!=0) {
            int ld = a % 10;
            sum += ld;
            a /= 10;
        }
       if(temp%sum == 0){
           System.out.println("Harshad Number");
       }
       else {
           System.out.println("Not Harshad Number");
       }
    }
}
