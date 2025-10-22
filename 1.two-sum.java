/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArr= new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = nums.length-1;j>i;j--){
                if(nums[i] + nums[j] == target){
                    resultArr[0] = i;
                    resultArr[1] = j;
                    return resultArr;
                }
            }
        }
        return null;
        
    }
}
// @lc code=end

