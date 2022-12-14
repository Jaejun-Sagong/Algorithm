package programmers.level2;

import java.util.Stack;

public class 올바른괄호 {
    class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();

            if (arr[0] == ')')
                return false;

            for (char c : arr) {
                if (c == '(')
                    stack.push(c);
                else {
                    if (stack.isEmpty())
                        return false;
                    else
                        stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
}
/*   시간초과 뜬 풀이
    class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();

            if (arr[0] == ')')
                return false;

            for (char c : arr) {
                if (stack.isEmpty())
                    stack.push(c);

                else if (stack.peek() == '(') {
                    if (c == ')')
                        stack.pop();
                    else {
                        stack.push(c);
                    }
                } else {
                    return false;
                }
            }

            return stack.isEmpty();
        }
    }
 */
