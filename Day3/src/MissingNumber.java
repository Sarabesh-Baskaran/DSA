//FInd the Missing Number in an Array
public class MissingNumber{
    public static void main(String[]args){
        int n = 7;
        int[] arr = {1,2,3,5,6,7};
        //we know the missing number is 4. but, how can we find it in code wise is matter.
        //To find the missing Number, we have one formula
        //s = n(n+1)/2;
        int missedNumber;
        //First, we have to get expectedSum.
        int expectedSum = 7*(7+1)/2; //Here, in this expectedSum stores one value. it is 28
        //we can use loop here to find the sum of the array.
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i]; //It actually sums and stores the value.

        }
        missedNumber = expectedSum-sum;
        System.out.println(missedNumber); //Output:4

    }
}