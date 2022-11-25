import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
    int arr[] = {23,1,-32,11};
    selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxElement(arr,0,last);
            swapping(arr,max,last);
        }
    }

    static void swapping(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxElement(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}
