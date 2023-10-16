import java.util.Arrays;

public class Alternating {
    public static void main(String[] args){
        int[] nums = {1,-2,6,4,-3,2,4,5,-3,6};
        System.out.println(Arrays.toString(dp(nums)));
    }

    public static int[] dp(int[] nums){
        if(nums.length == 0){
            int[] empty = {};
            return empty;
        }

        int maxLength = 1;
        int endIndex = 0;
        int currentLength = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i]* nums[i-1] < 0){
                currentLength++;
                if(currentLength>maxLength){
                    maxLength = currentLength;
                    endIndex = i;
                }
            }
            else{
                currentLength = 1;
            }
        }
        int[] subArray = Arrays.copyOfRange(nums,endIndex-maxLength+1,endIndex+1);
        return subArray;
    }
}
