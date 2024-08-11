import java.util.Scanner;

public class PrimeNumberPicnic {
    public static boolean isPrime(int n){
        int count =0;
        for (int i = 1; i <=n ; i++) {
            if(n%i ==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            if (isPrime(n)){
                sum = sum+i;
            }
        }
    }
}