/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        try {
            int j = 0;
            boolean flag = true;
            while (flag) {
                char temp = strs[0].charAt(j);
                for(int i = 1;i<strs.length;i++){
                    if(temp != strs[i].charAt(j)){
                        flag = false;
                    }
                }
                if(flag){
                    result += temp;
                }
                j++;
            }
        } catch ( IndexOutOfBoundsException e) {
            return result;
        }
        return result;
    }
}
// @lc code=end

