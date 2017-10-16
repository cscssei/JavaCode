public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            // i - point to the potential duplicate number.
            // j - check duplicate number
            // if the new number is different, replace that with the second duplicate number at i++
            // so we keep the first number and replace all the other duplicate number with the following different number
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        // return i+1 means we only keep nums[0,i+1] as the result
        return i+1;
    }
}
