import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {6,1,3,4,2,9,11};
        // set a window size from the tail from 2 number to n number
        for (int i = nums.length - 2; i > -1; i--){
            // each time put the smallest number to the last position
            for (int j = i; j < nums.length - 1; j++){
                if (nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
