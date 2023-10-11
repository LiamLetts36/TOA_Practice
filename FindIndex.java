import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Scanner keyboard = new Scanner(System.in);
        int target = keyboard.nextInt();
        System.out.println(binary_search(nums, target));
    }

    public static int binary_search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left<=right){
            mid = (left+right)/2;

            if(target ==nums[mid]){
                return mid;
            }

            if(target < nums[mid]){
                right = mid - 1;
            }

            else{
                left = mid + 1;
            }
        }
        return -1;

    }
}
