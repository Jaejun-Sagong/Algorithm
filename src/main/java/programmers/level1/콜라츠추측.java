package programmers.level1;

public class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;

        long n = num;  //num = 626331 일 경우 answer이 500을 넘어가면서 -1이 return 되어야하지만 오버플로우가 발생해서 488이 출력됨. => long으로 오버플로우 방지

        if (num == 1) {
            answer = 0;
        }

        while (n != 1) {
            if (answer == 500) {
                answer = -1;
                break;
            }
//            if ((n % 2) == 0) {
//                n /= 2;
//            } else {
//                n = (n * 3) + 1;
//            }
            n = (n%2 == 0) ? n/2 : (n*3) + 1;
            answer++;
        }
        return answer;
    }
}
