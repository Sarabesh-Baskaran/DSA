public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {10,25,30,45,50};
        int target = 45;
        int result = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                result = i;
            }

        }
        System.out.println(result);
    }
}
