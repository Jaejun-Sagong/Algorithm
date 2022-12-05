package programmers.level1;

import java.util.ArrayList;
import java.util.Objects;

public class 크레인인형뽑기게임 {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            ArrayList<Integer> answerList = new ArrayList<>();

            for(int i=0; i< moves.length; i++){
                for(int j=0; j< board.length; j++){
                    if(board[j][moves[i]-1] != 0){
                        answerList.add(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
//                System.out.println(answerList);
            }
            for(int i=0; i< answerList.size()-1; i++){
                if(Objects.equals(answerList.get(i), answerList.get(i + 1))) {
                    answerList.remove(i);
                    answerList.remove(i);
//                    System.out.println(answerList);
                    i = -1;
                    answer += 2;
                    if (answerList.size() == 0) {
                        break;
                    }
                }
            }

            return answer;
        }
    }