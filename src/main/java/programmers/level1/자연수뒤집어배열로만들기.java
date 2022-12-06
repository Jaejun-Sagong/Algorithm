package programmers.level1;

public class 자연수뒤집어배열로만들기 {
        public int[] solution1(long n) {

				/*1. 받아온 n값을 배열 형태로 리턴해야하는데
				정수형 자료형 내가 아는 메소드는 숫자연산과 증감연산이므로
				n값의 길이를 배열 초기화 시 사용하기 위해
				String형으로 변형 후 .length 사용*/
            // 문자열 + 숫자 = 문자열

            String a = "" + n;

            //int[] answer = {1, 2, 3, 4, 5}
            //위와 다르게 초기값 없이 배열 변수를 만들때에는 반드시 길이에 대한 숫자값이 필요하다.
            int[] answer = new int[a.length()];

            int cnt = 0;

            while (n > 0) {

                answer[cnt] = (int) (n % 10);
                n /= 10;
                cnt++;
            }
            return answer;
        }
    public int[] solution2(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        int index = 0;
        while (n>0){
            answer[index] = (int) (n%10);
            n /= 10;
            index++;
        }
        return answer;
    }
}
