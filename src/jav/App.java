package jav;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ProductArray productArray = new ProductArray();
        int[] nums = {1,2,3,4};

        int[] result = productArray.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
