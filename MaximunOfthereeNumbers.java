public class MaximunOfthereeNumbers {
    public static void main(String[] args) {
        int a= 40, b= 80,c= 30;
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>c && b>a) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
