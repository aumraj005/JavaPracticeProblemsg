//ip 19-> 10011
//o/p     11111 -> 31
//i/p 42 -> 101010
// o/p      111111 -> 63

import java.util.Scanner;

public class Binarysymetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String bin = "";
        while (a>0){
            bin = a%2 + bin;
            a = a/2;
        }
//        System.out.println(bin);
        int res = 0;
        for (int i = 0; i <bin.length(); i++) {
            res = res+ (int) Math.pow(2,i);
        }
//        int res = (int) Math.pow(2,bin.length())-1;
        System.out.println(res);
    }
}