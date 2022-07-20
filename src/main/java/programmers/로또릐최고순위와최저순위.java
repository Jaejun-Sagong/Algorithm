package programmers;

public class 로또릐최고순위와최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int sameNum = 0;
            for(int i=0; i<lottos.length; i++){
                for(int j=0; j<lottos.length; j++){
                    if(lottos[i] == win_nums[j]){
                        sameNum ++;
//                    System.out.println(sameNum);
                    }
                }
            }
            int countZero = 0;
            for(int i=0; i<lottos.length; i++){
                if(lottos[i]==0){
                    countZero++;
                }
            }
//       System.out.println(countZero);
            answer[0] = sameNum+countZero;
            answer[1] = sameNum;
            for(int i=0; i<2; i++){
                if(answer[i]==6){
                    answer[i] = 1;
                }
                else if(answer[i]==5){
                    answer[i] = 2;
                }
                else if(answer[i]==4){
                    answer[i] = 3;
                }
                else if(answer[i]==3){
                    answer[i] = 4;
                }
                else if(answer[i]==2){
                    answer[i] = 5;
                }
                else{
                    answer[i] = 6;
                }

            }
       /*  원래 내가 했던 방법
					if(answer[0] ==6){
            answer[0] = 1;
        }
        else if(answer[0] ==5){
            answer[0] = 2;
        }
        else if(answer[0] ==4){
            answer[0] = 3;
        }
        else if(answer[0] ==3){
            answer[0] = 4;
        }
        else if(answer[0] ==2){
            answer[0] = 5;
        }else{
            answer[0] = 6;
        }

        if(answer[1] ==6){
            answer[1] = 1;
        }
        else if(answer[1] ==5){
            answer[1] = 2;
        }
        else if(answer[1] ==4){
            answer[1] = 3;
        }
        else if(answer[1] ==3){
            answer[1] = 4;
        }
        else if(answer[1] ==2){
            answer[1] = 5;
        }else{
            answer[1] = 6;
        }
*/


            return answer;
        }
    }
}
