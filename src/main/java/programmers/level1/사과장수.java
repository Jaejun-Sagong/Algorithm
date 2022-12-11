package programmers.level1;

import java.util.Arrays;

public class 사과장수 {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            Arrays.sort(score);
            int remainder = score.length % m;
            for(int i=remainder; i< score.length;){
                answer += score[i]*m;
                i += m;
            }
            return answer;
        }
    }
}
