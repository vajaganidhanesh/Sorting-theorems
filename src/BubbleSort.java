import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {11,2,31,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void bubble(int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){

                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
