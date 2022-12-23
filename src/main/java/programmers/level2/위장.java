package programmers.level2;

import java.util.HashMap;

public class 위장 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> map = new HashMap<>();
            //모든 종류에 '없음'도 추가한다는 개념으로 default를 1로 설정
            for(int i =0; i<clothes.length; i++){
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1],1)+1);
            }
            for(String key : map.keySet()) {
                answer *= map.get(key);
            }
            answer--; // 모두 없음인 경우만 제거
            return answer;
        }
    }
}
