package jav;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Add all elements to the HashSet
        }

        int longestStreak = 0;

        for (int num : nums) {
            // Check if num is the starting element of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Calculate the length of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the longest streak if necessary
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int longestLength = solution.longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + longestLength);
    }
}


