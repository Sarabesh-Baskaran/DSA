import java.util.Arrays;

//Move Negative elements in the array to the beginning
public class MoveNegative{

    public static void moveNegative(int[] arr){

        //using two-pointers will effectively solve this problem
        int left = 0;
        int right = arr.length-1;

        while(left<right){

            if(arr[left]<0){
                left++;
            }
            else if(arr[right]>0){
                right--;
            }
            //If right is negative and left is positive in this case.
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            }
        }

    }
    public static void main(String[]args){
        int[] arr = {4,-2,7,-5,1};
        System.out.println("The Original Array is : " + Arrays.toString(arr));
        moveNegative(arr);
        System.out.print("The Modified Array is : " + Arrays.toString(arr));

    }
}