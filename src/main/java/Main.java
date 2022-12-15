import programmers.level1.다트게임;
import programmers.level2.영어끝말잇기;

public class Main {
    public static void main(String[] args) {
        영어끝말잇기 solution = new 영어끝말잇기();
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer = solution.solution(2,words);
        System.out.println(answer[0] + answer[1]);

    }
}