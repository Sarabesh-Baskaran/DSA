//Find maximum element in array.
public class Main{
    public static void main(String[]args){
        int[] arr = {10,25,7,42,18};
        int max = arr[0]; // To fix maximum as first element. So, it is easy to compare it to rest of the elements.
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum value is " + max);
        //For this problem, Time Complexity is O(n) because it have to search first to last value to get the largest value
        //Then, Space Complexity is O(1) because it don't care about amount of inputs. only it have to get atlast one value.

    }
}