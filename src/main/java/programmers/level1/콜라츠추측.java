package programmers.level1;

public class 콜라츠추측 {
    class Solution {
        public int solution(int num) {
            int answer = 0;

            long n = num;  //num = 626331 일 경우 answer이 500을 넘어가면서 -1이 return 되어야하지만 오버플로우가 발생해서 488이 출력됨. => long으로 오버플로우 방지

            if (num == 1 ){
                answer = 1;
            }

            while (n != 1) {
                if ((n % 2) == 0) {
                    n /= 2;
                    //System.out.println(num);
                }
                else {
                    n = (n*3) +1;
                    //System.out.println(num);
                }
                answer++;

                //주석처리 했지만 answer이 500이 되는순간 while문을 빠져나오기 때문에
                //더 깔끔한 방법
                //if(answer==500) {
                //answer=-1;
                //break;
                //}
            }

            if (answer>500) {    //만약에 answer이 무한대로 올라가면 무한루프에 빠질 수 있기 때                                                      문에 while문 내에서 break로 빠져나오는게 더 깔끔하다.
                answer = -1;
            }

            return answer;
        }
    }
}
