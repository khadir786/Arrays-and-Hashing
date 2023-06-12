package jav;
import java.util.HashMap;
import java.util.Map;
public class Sum{

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }


}

// hashmap is created
// first pass - first element is added to hashmap
// each subsequent pass looks to the previous keys in hashmap
// as in... with each pass, it looks to the left of the hashmap
// it checks to see if any of the values compliment the current value of the current index
// if it does, it returns both indexes