import java.util.Arrays;

//Merge Two Sorted Arrays
public class MergedArray{
    public static void main(String[]args){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] result = new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<=arr1.length-1 && j<=arr2.length-1){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else {
                result[k] = arr2[j];
                j++;
            }
            k++;

        }

        //copy remaining elements from array 1
        while(i<=arr1.length-1){
            result[k] = arr1[i];
            i++;
            k++;
        }

        //copy remaining elements from array 2
        while(j<=arr2.length-1){
            result[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println("The merged array: " + Arrays.toString(result));

    }
}