package programmers.level2;
import java.util.*;
public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        int releaseDate = 0;
        
        for(int i=0; i<progresses.length; i++){
            while(progresses[i] + (speeds[i] * releaseDate) < 100){
                releaseDate++; //releaseDate를 초기화 안시키는 것이 포인트
            }
            temp[releaseDate]++;
        }
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int n : temp){
            if(n != 0){
                answerList.add(n);
            }
        }

        int size = answerList.size();
        int[] answer = new int[size];

        for (int i=0; i<size; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
