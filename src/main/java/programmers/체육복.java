import java.util.*;

public class 체육복 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;

            ArrayList<Integer> lostList = new ArrayList<>();
            for (int i = 0; i < lost.length; i++) {
                lostList.add(lost[i]);
            }
            ArrayList<Integer> reserveList = new ArrayList<>();
            for (int i = 0; i < reserve.length; i++) {
                reserveList.add(reserve[i]);
            }
            //~리스트생성
            for (int i = 0; i < reserve.length; i++) {
                if (lostList.contains(reserve[i])) {
                    lostList.remove(reserve[i]);
                    reserveList.remove(reserve[i]);
                }
            }
            //중복값 제거
//        if(reserveList.size()!=0) {
            for (int i = 0; i < reserveList.size(); i++) {
                if (lostList.contains(reserveList.get(i) - 1)) {
                    lostList.remove(Integer.valueOf(reserveList.get(i) - 1));
                } else if (lostList.contains(reserveList.get(i) + 1)) {
                    lostList.remove(Integer.valueOf(reserveList.get(i) + 1));
                }
            }
            //전 번호 우선제거 후에 후번호 제거
//        }

            answer = n - lostList.size();


            return answer;
        }
    }
}