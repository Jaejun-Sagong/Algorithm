package programmers.level2;

public class 카펫 {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            double yellow1 = 2*yellow;
            int i=1;
            while(i>0) {
                if (brown == yellow1 / i + 2*i+4) {
                    answer[1] = i + 2;
                    answer[0] = (brown + yellow) / answer[1];
                    break;
                }
                i++;
            }

            return answer;
        }
    }
