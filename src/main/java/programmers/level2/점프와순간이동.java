package programmers.level2;

public class 점프와순간이동 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;

            while(n != 0){
                if(n % 2 == 0){
                    n /= 2;
                } else {
                    n--;
                    answer++;
                    n /= 2;
                }
            }

            return answer;
        }
    }
}
