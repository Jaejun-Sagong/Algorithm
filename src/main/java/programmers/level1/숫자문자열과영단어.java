package programmers.level1;

public class 숫자문자열과영단어 {
    //나의 풀이
    class Solution {
        public int solution(String s) {
            int answer = 0;
            if (s.contains("zero")) {
                s = s.replace("zero", "0");
            }
            if (s.contains("one")) {
                s = s.replace("one", "1");
            }
            if (s.contains("two")) {
                s = s.replace("two", "2");
            }
            if (s.contains("three")) {
                s = s.replace("three", "3");
            }
            if (s.contains("four")) {
                s = s.replace("four", "4");
            }
            if (s.contains("five")) {
                s = s.replace("five", "5");
            }
            if (s.contains("six")) {
                s = s.replace("six", "6");
            }
            if (s.contains("seven")) {
                s = s.replace("seven", "7");
            }
            if (s.contains("eight")) {
                s = s.replace("eight", "8");
            }
            if (s.contains("nine")) {
                s = s.replace("nine", "9");
            }
            if (s.contains("ten")) {
                s = s.replace("ten", "10");
            }

            answer = Integer.parseInt(s);

            return answer;
        }
    }
}

/*
//깔끔한 답안
class Solution {
    public int solution(String s) {

    String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
    String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }
}
 */