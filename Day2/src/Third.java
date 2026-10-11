import java.util.Arrays;

//Move Zeroes to The End.
//if input array is like arr = {0,1,0,3,12}
//Output will be like 1,3,12,0,0.
//Using a two-pointer technique is best approach
public class Third{
    public static void main(String[]ar){
        int[] arr = {0,1,0,3,12};
        int insert_idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[insert_idx]=arr[i];
                insert_idx++;
            }

        }
        for(int i=insert_idx;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.print(Arrays.toString(arr));

    }
}