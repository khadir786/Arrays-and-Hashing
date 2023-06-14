package jav;
import java.util.Arrays;
public class LongCons {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == (nums[i] + 1)){
                count++;
            }
        }

        return count;        
    }

}


