package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 카카오비밀지도 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String[] answer1 = new String[n];
            String[] answer2 = new String[n];
            int rest = 0;
            String strAnswer = "";

            for (int i = 0; i < n; i++) {
                answer1[i] = Integer.toBinaryString(arr1[i]);
                answer2[i] = Integer.toBinaryString(arr2[i]);
            }
            Integer[] intArray1 = Stream.of(answer1).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            Integer[] intArray2 = Stream.of(answer2).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            for(int i=0; i<n; i++){
                intArray1[i] += intArray2[i];
            }

            for(int i=0; i<n; i++){
                strAnswer = "";
                for(int j=0; j<n; j++){
                rest = intArray1[i]%10;
                if(rest !=0 ) {
                    strAnswer = "#" + strAnswer;
                } else{
                        strAnswer = " "+ strAnswer;
                    }
                    intArray1[i] /= 10;
                }

                answer[i] = strAnswer;
            }
            return answer;
        }
    }
}



