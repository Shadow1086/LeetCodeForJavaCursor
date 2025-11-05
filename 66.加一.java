/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start

/**
 * ClassName: 66.加一
 * Description:
 * 
 * 给定一个表示 大整数 的整数数组 digits，其中 digits[i] 是整数的第 i位数字。
 * 这些数字按从左到右，从最高位到最低位排列。这个大整数不包含任何前导 0。
 * 
 * 将大整数加 1，并返回结果的数字数组。
 * 
 * {@code @Author} Liang-ht
 * {@code @Create} 2025-11-05 15:43:24
 */

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        //如果需要增加一位
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
// @lc code=end
