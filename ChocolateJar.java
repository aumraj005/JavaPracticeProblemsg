public class ChocolateJar {
    public static void main(String[] args) {
        int jars = 3;
        int[] arr = {10,20,30};
        int a =0;
        for (int c: arr){
            int achoco = (c+2)/3;
            a = a+achoco;
        }
        System.out.println(a);
    }
}