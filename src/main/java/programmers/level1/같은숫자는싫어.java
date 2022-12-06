package programmers.level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public int[] solution1(int[] arr) {
        int[] answer = {};
        //arr에 따라 유연하게 변해야하므로 list 생성
        ArrayList<Integer> saveAnswer = new ArrayList<>();
        int b = 10; //10이 아니어도 arr[0]에 올 수 없는 값이면 됨.

        //index 벗어나지 않으면서 마지막 항까지 반영가능한 방법
        //나는 보통 length-1 과 i+1 을 사용하고 마지막 항은 따로 구현하는 비효율적인 방식 사용했었음.
        for (int i = 0; i < arr.length; i++)
            if (b != arr[i]) {
                b = arr[i];
                saveAnswer.add(b);
            }

        answer = new int[saveAnswer.size()];

        for (int i = 0; i < saveAnswer.size(); i++)
            answer[i] = saveAnswer.get(i);

        return answer;
    }
}