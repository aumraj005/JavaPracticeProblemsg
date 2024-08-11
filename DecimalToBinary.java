import java.util.Scanner;

public class DecimalToBinary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int decimalNumber = sc.nextInt();
            String binaryString = Integer.toBinaryString(decimalNumber);
            System.out.println("Decimal: " + decimalNumber);
            System.out.println("Binary: " + binaryString);
        }
    }
