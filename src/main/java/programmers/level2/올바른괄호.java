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

/*
class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack<>();
            if (s.charAt(0) == ')') {
                answer = false;
                return answer;
            }
            stack.push(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    stack.push('(');
                else{
                    if(stack.isEmpty()){
                        answer = false;
                        break;
                    } else if (stack.peek()=='(') {
                        stack.pop();

                    }
                }
            }
            if(!stack.isEmpty())
                answer = false;
            return answer;
        }
    }
 */

