package programmers.level2;

import java.util.Arrays;

public class 전화번호목록 {
    class Solution {
        public boolean solution(String[] phoneBook) {
            Arrays.sort(phoneBook);
//            System.out.println(Arrays.toString(phoneBook));
            for (int i = 0; i < phoneBook.length - 1; i++) {
                if(phoneBook[i].length()<phoneBook[i+1].length()) {
                    if (phoneBook[i].equals(phoneBook[i + 1].substring(0, phoneBook[i].length())))
                        return false;
                }
            }
            return true;
        }
    }
}
//앞 뒤 문자열 길이 비교 후 뒤쪽이 길면 위처럼
//앞이 길면 i, i+1 바꿔서