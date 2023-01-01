package programmers.level2;

import java.util.PriorityQueue;

public class 더맵게 {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<>();

            for (int j : scoville) {
                queue.add(j);
            }
            while(queue.peek() < K) {
                if (queue.size() < 2)
                    return -1;
                queue.add(queue.poll() + (queue.poll() * 2));
                answer++;
            }
            return answer;
        }
}
