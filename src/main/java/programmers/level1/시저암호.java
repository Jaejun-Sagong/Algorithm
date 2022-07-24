package programmers.level1;

public class 시저암호 {
    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            char[] save = s.toCharArray();
            for (int i = 0; i < save.length; i++) {
                if (save[i] == 32) {
                    continue;
                }
                if (64 < save[i] && save[i] < 91) {  //대문자
                    if (save[i] + n > 90) {       //알파벳 범위 밖
                        save[i] += n-26;
                    } else {
                        save[i] += n;
                    }
                }
                if (96 < save[i] && save[i] < 123) { //소문자
                    if (save[i] + n > 122) {       //알파벳 범위 밖
                        save[i] += n-26;
                    } else {
                        save[i] += n;
                    }
                }
            }
            for (int i = 0; i < save.length; i++) {
                answer += save[i];
            }
            return answer;
        }
    }
}
