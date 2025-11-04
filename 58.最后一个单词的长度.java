/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

import java.util.ArrayList;

/**
 * ClassName: 58.最后一个单词的长度
 * Description: 
 * 
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。n
 * {@code @Author} Liang-ht
 * {@code @Create} 2025-11-04 16:33:31
 */
// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s += ' ';
        ArrayList<String> arr = new ArrayList<>();
        //将字符串中的单词存入至数组中
        String temp = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                temp+=s.charAt(i);
            }else{
                if(!temp.isEmpty()){
                    arr.add(temp);
                    temp = "";
                }
            }
        }

        //取出数组中的最后一个元素
        try {
            String result = arr.get(arr.size() - 1);
            return result.length();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return -1;
        }
    }
}
// @lc code=end

