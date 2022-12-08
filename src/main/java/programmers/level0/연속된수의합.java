package programmers.level0;

public class 연속된수의합 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int startNum;
            int median = total / num;

            if (num % 2 == 1) {
                startNum = median - (num - 1) / 2;
            } else {
                startNum = median - (num - 2) / 2;
            }
            for (int i = 0; i < num; i++) {
                answer[i] = startNum + i;
            }
            return answer;
        }
    }
}
