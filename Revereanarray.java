import java.util.*;
public class Revereanarray {
    public static void main(String[] args) {
        int[] arr = {1,8,9,7,6,2};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
