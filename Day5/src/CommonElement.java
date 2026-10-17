//Common Elements in Two Sorted Arrays
public class CommonElement{
    public static void main(String[]args){
        int[] arr1 = {1,2,4,6,8};
        int[] arr2 = {2,4,5,8,10};
        System.out.print("Common Elements in Sorted Arrays: ");
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