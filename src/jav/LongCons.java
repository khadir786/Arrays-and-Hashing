package jav;
import java.util.Arrays;
public class LongCons {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        if (nums.length == 0) return count;
        count++;
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
//O(nlogn)


// public class LongestConsecutiveSequence {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num); // Add all elements to the HashSet
//         }

//         int longestStreak = 0;

//         for (int num : nums) {
//             // Check if num is the starting element of a sequence
//             if (!set.contains(num - 1)) {
//                 int currentNum = num;
//                 int currentStreak = 1;

//                 // Calculate the length of the sequence
//                 while (set.contains(currentNum + 1)) {
//                     currentNum += 1;
//                     currentStreak += 1;
//                 }

//                 // Update the longest streak if necessary
//                 longestStreak = Math.max(longestStreak, currentStreak);
//             }
//         }

//         return longestStreak;
//     }


