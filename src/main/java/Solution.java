import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int difference = target - value;
            if (indexMap.containsKey(difference)) return new int[]{indexMap.get(difference), i};

            indexMap.put(value, i);
        }

        throw new IllegalArgumentException("No two sum solution exists for the given arguments.");
    }
}
