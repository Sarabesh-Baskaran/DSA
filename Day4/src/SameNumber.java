//Finding Common Elements in Two Arrays
public class SameNumber{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        //Now we are using Brute Force
        System.out.print("Common Elements are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }

            }
        }
    }
}