package programmers.level2;

public class 일이사나라의숫자 {
    class Solution {
        public String solution(int n) {
            String[] num = {"4", "1", "2"};
            String answer = "";

            while (n > 0) {
                answer = num[n % 3] + answer;
                n = (n - 1) / 3;
            }

            return answer;
        }
    }
}

//    final String s = Integer.toString(100, radix);

//class Solution {
//    public String solution(int n) {
//        String answer = "";
//
//        while(n > 0){
//            int rest = n % 3;
//            n /= 3;
//            if(rest == 0){
//                rest = 4;
//                n -= 1; // 나누어 떨어졌으니까
//            }
//            answer = rest + answer;
//        }
//
//        return answer;
//    }
//}
