package programmers.level2;

import java.util.*;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : priorities){
            priorityQueue.add(n);
        }

        while(!priorityQueue.isEmpty()){
            for(int i = 0;i<priorities.length;i++){
                if(priorityQueue.peek() == priorities[i] ){
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
