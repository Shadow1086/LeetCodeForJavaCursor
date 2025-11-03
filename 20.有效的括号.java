/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start

/**
 * ClassName: 20.有效的括号
 * Description: 
 * 
 * 使用栈，和HashMap知识解决如下题目：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 1.左括号必须用相同类型的右括号闭合。
 * 2.左括号必须以正确的顺序闭合。
 * 3.每个右括号都有一个对应的相同类型的左括号。
 * 如："()"  返回true
 * {@code @Author} Liang-ht
 * {@code @Create} 2025-11-03 18:05:27
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>(Map.of(
                '(', ')', '{', '}', '[', ']'));

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            // if (ch == '(' || ch == '{' || ch == '[') {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else if (map.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();

    }
}
// @lc code=end
