package programmers.level1;

public class 키패드누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                answer += "L";
                left = n;

            } else if (n == 3 || n == 6 || n == 9) {
                answer += "R";
                right = n;

            } else {
                if (n == 0) {
                    n = 11;
                }
                int leftDistance = (Math.abs(n - left)) / 3 + (Math.abs(n - left)) % 3;
                int rightDistance = (Math.abs(n - right)) / 3 + (Math.abs(n - right)) % 3;
                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = n;
                    } else {
                        answer += "L";
                        left = n;
                    }
                } else if (leftDistance > rightDistance) {
                    answer += "R";
                    right = n;
                } else {
                    answer += "L";
                    left = n;
                }
            }
        }
        return answer;
    }
}
