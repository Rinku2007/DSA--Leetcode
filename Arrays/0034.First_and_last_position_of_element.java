/*34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]*/



class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;


        //first position
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first=mid;
                end=mid-1;
                
            }
            else if (nums[mid] < target) {
                // target is on the right side
                start = mid + 1;
            }
            else {
                // target is on the left side
                end = mid - 1;
            }
        }
        start=0;
        end=nums.length-1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last=mid;
                start=mid+1;
                
            }
            else if (nums[mid] < target) {
                // target is on the right side
                start = mid + 1;
            }
            else {
                // target is on the left side
                end = mid - 1;
            }
        }
    return new int[] {first,last};

    }
}
        