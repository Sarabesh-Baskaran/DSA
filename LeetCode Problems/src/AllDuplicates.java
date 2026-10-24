//Finding All Duplicates in an array
public class AllDuplicates{
    public static int DuplicateNum(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int twice = 0;
        while(left<right){
            if(nums[left]==nums[right]){
                twice = nums[left];
                left++;



            }
            else if(nums[left]!=nums[right]){
                left++;
                right--;
            }
        }
        return twice;
    }
    public static void main(String[]args){
        int[] nums = {4,3,2,7,8,2,3,1};

        int result = DuplicateNum(nums);


        System.out.print("The Duplicate Values are: ");
        for(int i=1;i<result;i++){
            System.out.print(nums[i]+" ");
        }



    }
}