/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int mid = (right + left) / 2;
        while (left <= right) {
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid -1;
                mid = (right + left) / 2;
            }else if(nums[mid]<target){
                left = mid + 1;
                mid = (right + left) / 2;
            }
        }
        //若不在数组中，返回应该应该插入到的位置
        return left;
    }
}
// @lc code=end

//[3 , 5]   4,