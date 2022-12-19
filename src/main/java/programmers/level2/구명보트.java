package programmers.level2;

import java.util.Arrays;

public class 구명보트 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            Arrays.sort(people);

            int minIndex = 0;
            int maxIndex = people.length - 1;

            while(minIndex <= maxIndex ) {
                if(people[maxIndex] + people[minIndex] <= limit) {
                    answer++;
                    maxIndex--;
                    minIndex++;
                }
                else {
                    answer++;
                    maxIndex--;
                }
            }
            return answer;
        }
    }
}
