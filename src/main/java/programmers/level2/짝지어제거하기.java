package programmers.level2;

import java.util.ArrayList;

public class 짝지어제거하기 {
    class Solution {
        public int solution(String s) {
            int answer = -1;
            ArrayList<Character> list = new ArrayList<>();
            char[] arr = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {
                if (list.isEmpty())
                    list.add(arr[i]);
                else {
                    if (list.get(list.size()-1).equals(arr[i]))
                        list.remove(list.size()-1);
                    else {
                        list.add(arr[i]);
                    }
                }
            }

            return list.isEmpty() ? 1:0;
        }
    }
}
