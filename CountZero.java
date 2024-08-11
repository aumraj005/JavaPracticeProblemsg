public class CountZero {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == 0 && arr[mid + 1] == 1) {
                System.out.println(mid + 1);
                break;
            } else if (arr[mid] == 0) {
                i = mid + 1;
            } else {
                j = mid;
            }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0){
//                count++;
//            }
//            else {
//                break;
//            }
//        }
//        System.out.println(count);
        }
    }
}
