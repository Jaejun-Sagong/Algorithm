import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        ArrayList<Float> difficulty1 = new ArrayList<Float>();
        ArrayList<Float> difficulty2 = new ArrayList<Float>();
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int[] stopArr = new int[N];
        int[] sumStopArr = new int[N];
        int[] reachArr = new int[N];
        String arr[] = new String[stages.length];

        for (int i = 0; i < stages.length; i++) {
            arr[i] = "" + stages[i];
        }
        List<String> list = Arrays.asList(arr);
        int n1 = stages.length;

        for (int i = 0; i < answer.length; i++) {
            int a = Collections.frequency(list, Integer.toString(i + 1));
            if(a!=0){
                difficulty1.add((float)a/n1);
                n1-=a;
            } else{
                difficulty1.add(0.0F);
            }

//            System.out.println(Arrays.toString(sumStopArr));
//            System.out.println(Arrays.toString(reachArr));
        }



        difficulty2.add(difficulty1.get(0));  //0.12  0.5 0.5 0.3 0
        answerList.add(1);
        for (int i = 1; i < answer.length; i++) {
            if (difficulty1.get(i) > difficulty2.get(0)) {
                difficulty2.add(0, difficulty1.get(i));
                answerList.add(0, i + 1);
            } else if (difficulty1.get(i) <= difficulty2.get(difficulty2.size() - 1)) {
                difficulty2.add(difficulty1.get(i));
                answerList.add(i + 1);
            } else if (difficulty1.get(i) <= difficulty2.get(0) && difficulty1.get(i) > difficulty2.get(difficulty2.size() - 1)) {
                for (int j = 1; j < difficulty2.size(); j++) {
                    if (difficulty1.get(i) > difficulty2.get(j)) {
                        difficulty2.add(j, difficulty1.get(i));
                        answerList.add(j, i + 1);
                        break;
                    }
                }
            }
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}