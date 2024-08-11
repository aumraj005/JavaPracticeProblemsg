public class FoundOrNot {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int key = 18;
        boolean flag = true;
        for (int i = 0; i<= arr.length-1; i++){
            if (arr[i] == key) {
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found");
        }
    }
}
