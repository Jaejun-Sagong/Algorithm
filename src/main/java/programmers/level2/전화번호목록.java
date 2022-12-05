package programmers.level2;

import java.util.Arrays;

public class 전화번호목록 {
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

