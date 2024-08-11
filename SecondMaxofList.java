public class SecondMaxofList {
    public static void main(String[] args) {
        int [] arr ={4,10,6,2,10,11,11,1,0};
        int f_max,s_max;
        if(arr[0]<arr[1]){
            s_max =arr[0];
            f_max = arr[1];
        }
        else {
            s_max =arr[1];
            f_max = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > f_max){
                s_max = f_max;
                f_max =arr[i];
            } else if (arr[i] > s_max && arr[i] != f_max) {
                s_max = arr[i];
            }
        }
        System.out.println(s_max);
    }
}