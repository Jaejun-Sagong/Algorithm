package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
        public int[] solution(int[] answers) {
            int[] answer = {};
            Set<Integer> s = new HashSet<>();
            for(int i=0; i<answers.length-1; i++) {
                for (int j = i + 1; j < answers.length; j++) {
                    s.add(answers[i] + answers[j]);
                }
            }
//set을 배열로 변환시키는 메소드를 구글링해서 적용시켰지만 정확한 이해를 못함
            answer = s.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            Arrays.sort(answer);


            return answer;
        }
    }