package jav;
public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // left product
        int leftProduct = 1; // in case of first element, would need to multiply by 1
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // right product
        int rightProduct = 1; // in case of last element, would need to multiply by 1
        for (int i = nums.length; i >=0 ; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;



    }
}

// calculate the product of all the elements left of the element
// store in answer array

// calculate the product of all the elements right of the element
// store in answer array

// [1,2,3,4]

// i = 0 -> answer[i] = 1, leftProduct = 1
// i = 1 -> answer[i] = 1, leftProduct = 1
// i = 2 -> answer[i] = 2, leftProduct = 2
// i = 3 -> answer[i] = 6, leftProduct = 6





































// int length = nums.length;
//         int[] answer = new int[length];

//         // Calculate the product of all elements to the left of each element
//         int leftProduct = 1;
//         for (int i = 0; i < length; i++) {
//             answer[i] = leftProduct;
//             leftProduct *= nums[i];
//         }

//         // Calculate the product of all elements to the right of each element and multiply it with the existing answer
//         int rightProduct = 1;
//         for (int i = length - 1; i >= 0; i--) {
//             answer[i] *= rightProduct;
//             rightProduct *= nums[i];
//         }

//         return answer;