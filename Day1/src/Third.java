//Binary Search
public class Third{
    public static void main(String[]args){
        int[] arr = {10,20,30,40,50,60,70};
        int target = 50;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("The target element index is " + i);
            }
            else{
                continue;
            }
        }
    }
}
//Time complexity is O(n)
//Space Complexity is O(1).