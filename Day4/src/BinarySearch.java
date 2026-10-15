//Binary Search
//The array must be sorted when it comes to Binary Search
public class BinarySearch{
    public static void main(String[]args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 70;
        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                System.out.print(mid);
                break;
            }

            else if(arr[mid]<target){
                left = mid+1;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                System.out.print(result);
            }


        }


    }
}