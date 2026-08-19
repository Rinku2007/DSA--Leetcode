/*75. Sort Colors
You are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]

Explanation:

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.*/



//Using nested loop and temp. variable

class Solution {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            int smallestIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[smallestIndex];
            nums[smallestIndex] = temp;
        }
        return;
    }
}



