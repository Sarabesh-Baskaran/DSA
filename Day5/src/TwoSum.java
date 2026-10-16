//Two Sum in a Sorted Array
public class TwoSum{
    public static void main(String[]args){
        int[] arr = {1,2,4,6,8,9};
        int target = 10;
        int left = 0;
        int right = arr.length-1;
            System.out.print("The common pairs are: ");
        while(left<right){
           int currentSum = arr[left]+arr[right];
           if(currentSum==target){
               System.out.println(arr[left] + " " + arr[right]);
               // Move BOTH pointers inward to look for the next distinct pair
               left++;
               right--;
           }
           else if (currentSum > target) {
               right--;
           }
           else {
               left++;
           }
        }


    }
}