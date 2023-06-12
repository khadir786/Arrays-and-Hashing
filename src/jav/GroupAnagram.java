package jav;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap to store groups of anagrams
        Map<String, List<String>> map = new HashMap<>();

        if (strs.length == 0 || strs == null) {
            return new ArrayList<>(); 
        }

        for (String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            
            // Check if the key exists in the hashmap, if not, create a new entry
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            
            // Add the current string to the corresponding anagram group
            map.get(keyStr).add(str);
        }
        // Return a list containing all the anagram groups
        return new ArrayList<>(map.values());
    }
}

// Create a hashmap to store groups of anagrams
// Check if the input array is empty or null
//   - If true, return an empty list indicating no strings are provided
// Iterate over each string in the input array
//   - Convert the string into a character array
//   - Sort the character array to create a key for anagrams
//   - Check if the key exists in the hashmap
//     - If not, create a new entry with an empty ArrayList
//   - Add the current string to the corresponding anagram group
// Return a list containing all the anagram groups



//create hashmap
// split strings into characters
// sort the characters
// add characters to hashmap
// if it is already there
// then add it to the anagram group

//while (i+1 ==  nums[i] + 1) 