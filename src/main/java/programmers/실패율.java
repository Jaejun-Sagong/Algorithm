package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 실패율 {
    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            ArrayList<Float> difficulty1 = new ArrayList<Float>();
            ArrayList<Float> difficulty2 = new ArrayList<Float>();
            ArrayList<Integer> answerList = new ArrayList<Integer>();
            int[] stopArr = new int[N];
            int[] sumStopArr = new int[N];
            int[] reachArr = new int[N];
            String arr[] = new String[stages.length];

            for (int i = 0; i < stages.length; i++) {
                arr[i] = "" + stages[i];
            }

            for (int i = 0; i < answer.length; i++) {
                stopArr[i] = Collections.frequency(Arrays.asList(arr), Integer.toString(i + 1)); //분자
                for(int j =0; j<i+1; j++) {
                    sumStopArr[i] += Collections.frequency(Arrays.asList(arr), Integer.toString(j));
                }
                reachArr[i] = stages.length - sumStopArr[i]; //분모
//            System.out.println(Arrays.toString(sumStopArr));
//            System.out.println(Arrays.toString(reachArr));
            }
            for (int i = 0; i < answer.length; i++) {
                if (stopArr[i] != 0) {
                    difficulty1.add((float) stopArr[i] / (float) reachArr[i]);
//            System.out.println(difficulty1);
                }
                else{
                    difficulty1.add(0.0F);  // 0으로 나눠지는 것 방지
                }
            }


            difficulty2.add(difficulty1.get(0));
            answerList.add(1);
            for (int i = 1; i < answer.length; i++) {
                if (difficulty1.get(i) > difficulty2.get(0)) {
                    difficulty2.add(0, difficulty1.get(i));
                    answerList.add(0, i + 1);
                } else if (difficulty1.get(i) <= difficulty2.get(difficulty2.size() - 1)) {
                    difficulty2.add(difficulty1.get(i));
                    answerList.add(i + 1);
                } else if (difficulty1.get(i) <= difficulty2.get(0) && difficulty1.get(i) > difficulty2.get(difficulty2.size() - 1)) {
                    for (int j = 0; j < difficulty2.size(); j++) {
                        if (difficulty1.get(i) > difficulty2.get(j)) {
                            difficulty2.add(j, difficulty1.get(i));
                            answerList.add(j, i + 1);
                            j = difficulty2.size();
                        }
                    }
                }
            }

            for(int i=0; i<answer.length; i++){
                answer[i] = answerList.get(i);
            }

            return answer;
        }
    }
}
