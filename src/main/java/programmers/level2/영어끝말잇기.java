package programmers.level2;

import java.util.ArrayList;

public class 영어끝말잇기 {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            char lastCharacter;
            String lastWord;
            ArrayList<String> list = new ArrayList<>();

            list.add(words[0]);

            for(int i=1; i<words.length; i++) {
                lastWord = list.get(i-1);
                lastCharacter = lastWord.charAt(lastWord.length()-1);
                if(words[i].charAt(0) == lastCharacter && !list.contains(words[i]))
                    list.add(words[i]);
                else{
                    answer[0] = (list.size() % n) + 1;
                    answer[1] = (list.size() / n) + 1;
                    break;
                }
            }
            return answer;
        }
    }
