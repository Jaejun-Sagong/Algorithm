package programmers.level1;

import java.util.Stack;

public class 햄버거 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : ingredient) {
            stack.push(integer);
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 1) == 1
                        && stack.get(size - 2) == 3
                        && stack.get(size - 3) == 2
                        && stack.get(size - 4) == 1) {
                    answer++;
                    for (int i = 0; i < 4; i++)
                        stack.pop();
                }
            }
        }
        return answer;
    }
}
