import java.util.*;

public class RotateArray {
    // rotate the array for a specific range
    public static int[] reverse(int[] nums, int i, int j){
        for(; i<=j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        // rotate the first part - [4,3,2,1,5,6,7]
        reverse(nums, 0, nums.length - k - 1);
        // rotate the second part - [4,3,2,1,7,6,5]
        reverse(nums, nums.length - k, nums.length - 1);
        // rotate the whole array - [5,4,3,1,2,3,4]
        reverse(nums, 0, nums.length - 1);

        return;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
