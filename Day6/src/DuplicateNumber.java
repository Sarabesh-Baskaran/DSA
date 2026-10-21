//Remove Duplicates from Sorted Array
public class DuplicateNumber{
    //A method to remove duplicates
    public static int removeDuplicate(int[] arr){
        int i=0;
        //pointer j scans the array from second element
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++; //move the pointer forward
                arr[i]=arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[]args){
        int[] arr = {1,1,2,2,3,4,4,5};

        int unique = removeDuplicate(arr);
         System.out.println("Number of unique elements: " + unique);
         System.out.print("The modified unique array: ");

         for(int i = 0; i<unique; i++){
             System.out.print(arr[i]+" ");
         }
    }
}