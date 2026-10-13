import java.util.Arrays;

//Rotate an array by one position
public class RotateArray{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        //In arrays, we can access it by using Index value.
        int tempValue = arr[4];
        for(int i=4;i>0;i--){
            arr[i]=arr[i-1];
            //here, what happens is
            //arr[4] = arr[4-1]=>arr[3]=40;
            //arr[3] = arr[3-1]=>arr[2]=30;
            //arr[2] = arr[2-1]=>arr[1]=20;
            //arr[1] = arr[1-1]=>arr[0]=10
            //Now, arr[0] is empty. So, we can place the tempValue here.
        }
        arr[0]=tempValue;
        System.out.println(Arrays.toString(arr));
    }
}