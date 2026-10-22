import java.util.Arrays;

//Maximum Difference between 2 elements which one is Max and other one is Min.
public class MaxDifference{
    public static void main(String[]args){
        int[] arr = {3,8,1,10,4};
        int max = arr[0];
        int min = arr[0];



        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("The maximum elements is : " + max);
        System.out.println("The minimum elements is : " + min);
        System.out.println("The difference between two value is: " + diff);
    }
}