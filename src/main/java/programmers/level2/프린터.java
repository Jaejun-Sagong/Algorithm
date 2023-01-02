package programmers.level2;

import java.util.*;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : priorities){
            priorityQueue.add(n);
        }
        //for문 반복 의도를 이해하고 배워가자.
        while(!priorityQueue.isEmpty()){
            for(int i = 0;i<priorities.length;i++){
                //우선순위 큐 front의 위치를 찾는다.
                if(priorityQueue.peek() == priorities[i]){
                    priorityQueue.poll();
                    answer++;
                    if(location == i )
                        return answer;
                }
            }
        }
        return answer;
    }
}
