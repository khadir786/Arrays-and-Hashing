package jav;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        LongCons lc = new LongCons();
        int[] nums = {100,4,200,1,3,2};

        int result = lc.longestConsecutive(nums);
        System.out.println((result));
    }
}
