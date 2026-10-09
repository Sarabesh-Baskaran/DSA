import java.util.Arrays;

//Reverse an array using two pointer technique
public class Second{
    public static void reverseArray(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reverse Array: " + Arrays.toString(arr));

    }
}