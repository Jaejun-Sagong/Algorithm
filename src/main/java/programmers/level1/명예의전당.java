package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 명예의전당 {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            ArrayList<Integer> list = new ArrayList();
            for (int i=0; i<score.length; i++) {
                if (i<k-1){
                    list.add(score[i]);
                    list.sort(Collections.reverseOrder());
                    answer[i]=list.get(list.size()-1);
                } else if (i>=k-1){
                    list.add(score[i]);
                    list.sort(Collections.reverseOrder());
                    answer[i]=list.get(k-1);
                }
            }
            return answer;
        }
    }
}
