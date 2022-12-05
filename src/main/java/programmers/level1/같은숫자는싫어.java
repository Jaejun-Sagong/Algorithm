package programmers.level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
        public int[] solution(int[] arr) {
            int[] answer = {};
            //arr에 따라 유연하게 변해야하므로 list 생성
            ArrayList<Integer> saveAnswer = new ArrayList<>();
            int b = 10; //10이 아니어도 arr[0]에 올 수 없는 값이면 됨.

            for (int i = 0; i < arr.length; i++)
                if (b != arr[i]) {
                    b = arr[i];
                    saveAnswer.add(b);
                }

            answer = new int[saveAnswer.size()];

            for ( int i = 0; i < saveAnswer.size(); i++)
                answer[i] = saveAnswer.get(i);

            return answer;
        }
    }