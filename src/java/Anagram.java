package java;
import java.util.Arrays;
public class Anagram {

    // convert strings to arrays, sort then check if equal
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    // Is only good in small arrays. Larger arrays take longer to sort
    //  Time complexity O(n log n), where n is the length of the input array




    /**
    /**
     *  make letter count array where each element corresponds to letter in alphabet
        increment letter count for a letter present in string s
        decrement letter count for a letter present in string t
        if strings are anagrams then each element in letter count array should = 0
     * @param s string 1
     * @param t string 2
     * @return boolean: true if anagram
     */
    public boolean isAnagramFaster(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // makes an index that corresponds to alphabet from ascii numbers
                                       // e.g. c = ascii 99 a = ascii 97    99-97 = 2   [a,b,(c)] 
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
}



