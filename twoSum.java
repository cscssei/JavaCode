import java.util.*;

public class twoSum {
    public int[] twoSum1(int[] nums, int target) {
        // O(n), use hash map to check if another number in the map
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        // O(n^2), use a nested loop to look each pair of the numbers
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[] {nums[i], nums[j]};
            }
        }
        return null;
    }
}
