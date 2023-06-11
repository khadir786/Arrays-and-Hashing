package java;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class KFrequent {
    public int[] mostFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], (map.get(nums[i]) + 1));
            } 
            else {map.put(nums[i], 1);}
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}


// import java.util.*;

// public class KFrequent {
//     public int[] mostFrequent(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
//                 Comparator.comparingInt(Map.Entry::getValue)
//         );

//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             pq.offer(entry);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }

//         int[] result = new int[k];
//         for (int i = k - 1; i >= 0; i--) {
//             result[i] = pq.poll().getKey();
//         }

//         return result;
//     }
// }


// We use a HashMap 'map' to store the frequency of each element in 'nums'.
// Instead of converting 'map' into a list and sorting it, we use a PriorityQueue 'pq' to keep track of the 'k' most frequent elements.
// While iterating through the entries in 'map', we add each entry to 'pq'. If 'pq' size exceeds 'k', we remove the entry with the lowest frequency.
// After processing all entries, 'pq' will contain the 'k' most frequent elements, with the minimum frequency at the top.
// We extract elements from 'pq' in reverse order, starting from the end of the 'result' array, ensuring that the most frequent element is placed at the end.

// The updated code reduces the time complexity to O(n log k), as inserting and removing elements in the priority queue takes O(log k) time, and we perform these operations for 'n' elements.
