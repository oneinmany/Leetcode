/*
Median of an Array
Difficulty: BasicAccuracy: 44.57%Submissions: 138K+Points: 1
Given an array arr[] of integers, calculate the median.

Examples:

Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median 
Input: arr[] = [56, 67, 30, 79]
Output: 61.5
Explanation: In case of even number of elements, average of two middle elements is the median. 
Input: arr[] = [1, 2]
Output: 1.5
Explanation: The average of both elements will result in 1.5.
Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 105
*/
class Solution {
    public double findMedian(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0) {
            return (double) (nums[n / 2 - 1] + nums[n / 2]) / 2;
        } else {
            return (double) nums[n / 2];
        }
    }
}
