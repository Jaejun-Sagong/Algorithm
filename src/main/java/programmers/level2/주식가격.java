package programmers.level2;

import java.util.Stack;

/*이중 반복문으로 쉽게 풀 수 있지만 시간복잡도가 크기때문에 스택/큐 문제로 분류된 것 같다.
처음 풀 때에는 다른 사람들의 풀이를 참고하고 이해를 하였지만 다시 봤을 때 풀기 어려웠음.
https://girawhale.tistory.com/7
*/
public class 주식가격 {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            Stack<Integer> stack = new Stack();

            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                answer[stack.peek()] = prices.length - stack.peek() - 1;
                stack.pop();
            }

            return answer;
        }
}
