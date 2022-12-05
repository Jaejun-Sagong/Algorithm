package programmers.level1;

import java.util.Arrays;

public class 문자열내마음대로정렬 {
        public String[] solution(String[] strings, int n) {
            String[] answer = new String[strings.length];
            for(int i =0; i < strings.length; i++){
                strings[i] = strings[i].charAt(n) + strings[i];
            }
            Arrays.sort(strings);
            for(int i =0; i < strings.length; i++){
                answer[i] = strings[i].substring(1);
            }
				/*타겟 문자열을 반환하는 substring 대신에
				타겟 문자열을 삭제 후 나머지를 반환해주는 deleteCharAt(index)를 사용하고싶었으나
				deleteCharAt은 StringBuffer 메소드라 사용 못함.*/


            return answer;
        }
    }
