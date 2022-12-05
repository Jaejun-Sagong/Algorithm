package programmers.level1;

public class 최소직사각형 {
        public int solution(int[][] sizes) {
            int answer = 0;
            int[] maxArr = new int[sizes.length];
            int[] minArr = new int[sizes.length];
            for (int i=0; i < sizes.length; i++){
                maxArr[i] = Math.max(sizes[i][0], sizes[i][1]);
                minArr[i] = Math.min(sizes[i][0], sizes[i][1]);
            }
            int max =0;
            int min =0;
            for(int i=0; i< maxArr.length; i++){
                if (max<maxArr[i]){
                    max = maxArr[i];
                }
                if (min<minArr[i]){
                    min = minArr[i];
                }
            }
            answer = max*min;
            return answer;
        }
    }
