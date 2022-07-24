package programmers.level1;

import java.util.Arrays;

public class k번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = {};
            int[][] sliceArr = new int[commands.length][];
//        int start = commands[0][0];
//        int end = commands[0][1];
//        int idx = commands[0][2];
            for(int i=0; i<commands.length; i++){
                commands[i][0] -= 1;
            }
            for(int i=0; i < commands.length; i++) {
                for (int j = 0; j < 3; j++) {
                    sliceArr[i] = Arrays.copyOfRange(array, commands[i][0], commands[i][1]); //자른 배열 전달
                }
            }
            answer = new int [sliceArr.length];
            for(int i=0; i< sliceArr.length; i++) {
                Arrays.sort(sliceArr[i]);
                sliceArr[i]=Arrays.copyOfRange(sliceArr[i],commands[i][2]-1,commands[i][2]); //열의 개수가 1인 2차원 배열
            }
            for(int i=0; i< sliceArr.length; i++){
                answer[i] = sliceArr[i][0];
            }


            return answer;
        }
    }
}
