package programmers;

import java.util.ArrayList;

public class 모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            //나는 stu들의 배열의 크기를 answers.length에 맞춰 생성 후
            //값을 꽉 채워넣으려고 고민을 했다.
            int[] stu1 = {1,2,3,4,5};
            int[] stu2 = {2,1,2,3,2,4,2,5};
            int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
            //반복 구간만 배열로 선언 후 적절히 나머지연산을 쓰면 i가 아무리 커져도
            //인덱스 범위를 벗어나는 에러없이 실행 가능.
            int[] cnt = new int[3];
            for(int i=0; i<answers.length; i++){
                if (answers[i] == stu1[i%5]){
                    cnt[0]++;
                }
                if (answers[i] == stu2[i%8]){
                    cnt[1]++;
                }
                if (answers[i] == stu3[i%10]){
                    cnt[2]++;
                }
            }
            //나는 stu 3명의 맞춘 갯수를 비교해 조건문을 통해 넣으면되는데
            //stu와 cnt를 어떻게 연결시켜넣고 오름차순으로 할지 고민을 했는데
            //3개의 값 중 최대값이 몇 개
            int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
            ArrayList<Integer> maxStudent = new ArrayList<> ();
            if(cnt[0]==max){
                maxStudent.add(1);
            }
            if(cnt[1]==max){
                maxStudent.add(2);
            }
            if(cnt[2]==max){
                maxStudent.add(3);
            }
            answer = new int[maxStudent.size()];
            for(int i=0; i<maxStudent.size(); i++){
                answer[i] = maxStudent.get(i);
            }
            return answer;
        }
    }
}
