public class Rotation {
    public static void main(String[] args){
        int[] nums = {8,9,10,1,2,3,4,5,6,7};
        System.out.println(binary_search(nums));
    }

    public static int binary_search(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left <=right){

            if(nums[left] < nums[right]){
                return left;
            }

            mid = (left+right)/2;

            int next = (mid+1)%nums.length;
            int prev = (mid-1)%nums.length;

            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
                return mid;
            }

            if(nums[mid] <= nums[right]){
                right = mid - 1;
            }

            if(nums[mid] >= nums[left]){
                left = mid + 1;
            }
        }
        return -1;
    }


}
