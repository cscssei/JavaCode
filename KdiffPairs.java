import java.util.*;

public class KdiffPairs {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        // build a hashmap to store unique numbers from the input list, number as key, repeat times as value
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i: nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        // take out each paris from the map, and compare with k
        for(Map.Entry<Integer, Integer> number: map.entrySet()) {
            // if k=0, only the number repeat more than once will be counted
            if(k==0) {
                if(number.getValue()>1) {
                    count++;
                }
            }
            //  find the target number
            else {
                if(map.containsKey(number.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
