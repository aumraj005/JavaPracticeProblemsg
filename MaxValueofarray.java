public class MaxValueofarray {
    public static void main(String[] args) {
        int [] arr  = {1,8,9,7};
        int max_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max_val < arr[i]){
                max_val = arr[i];
            }
        }
        System.out.println(max_val);
    }
}
