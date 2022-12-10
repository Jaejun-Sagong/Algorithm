package programmers.level1;


public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        int arrIndex = 0;
        int[] arr = new int[4];
        //숫자 저장
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == '0' || (dartResult.charAt(i) > '1' && dartResult.charAt(i) <= '9')) {
                arr[arrIndex] = Integer.parseInt(String.valueOf(dartResult.charAt(i)));
                arrIndex++;
            } else if (dartResult.charAt(i) == '1') {
                if (dartResult.charAt(i + 1) == '0') {
                    arr[arrIndex] = 10;
                    i++;
                    arrIndex++;
                } else {
                    arr[arrIndex] = 1;
                    arrIndex++;
                }
            }
            switch (dartResult.charAt(i)) {
                case 'D':
                    arr[arrIndex-1] = (int) Math.pow(arr[arrIndex-1], 2);
                    break;
                case 'T':
                    arr[arrIndex-1] = (int) Math.pow(arr[arrIndex-1], 3);
                    break;
                case '*':
                    if (arrIndex - 1 > 0) {
                        arr[arrIndex - 1] *= 2;
                        arr[arrIndex - 2] *= 2;
                        break;
                    } else {
                        arr[arrIndex - 1] *= 2;
                        break;
                    }
                case '#':
                    arr[arrIndex - 1] *= -1;
                    break;
            }
        }
        answer = arr[0] + arr[1] + arr[2];
        return answer;
    }
}