package programmers.level2;

public class 다음큰숫자 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String string = Integer.toBinaryString(n);
            int numCnt = 0;

            for(int i = 0; i < string.length(); i++){
                if(string.charAt(i) == '1')
                    numCnt++;
            }

            for(int i = n+1; i<1000000; i++){
                String temp = Integer.toBinaryString(i);
                int nextNumCnt = 0;
                for(int j = 0; j < temp.length(); j++){
                    if(temp.charAt(j) == '1')
                        nextNumCnt++;
                }

                if(nextNumCnt == numCnt) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
