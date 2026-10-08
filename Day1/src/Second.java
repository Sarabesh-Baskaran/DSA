//Linear Search in an array
public class Second{
    public static void main(String[]args){
        int[] arr = {5,12,8,20,15};
        int target = 20;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("The target element is found in this index number is " + i);
            }
            else{
                continue;
            }
        }
    }
}
//Approach is comparing each element with target element to get match.
//Time Complexity is O(n), because as long as input grows the time also grows.
//Space Complexity is O(1).