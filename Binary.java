public class Binary {
    public static int[] nums = {2,3,4,5,6,7,8,10,12,15,18,20};
    public static int target = 20;

    public static void main(String[] args){
        System.out.println(binary_search());
    }

    public static int binary_search(){
        int mid = 0;
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            mid = (left+right)/2;

            if(target == nums[mid]){
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
