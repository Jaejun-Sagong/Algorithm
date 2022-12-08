package programmers.level1;

import java.util.Calendar;
import java.util.*;

public class 해당날짜의요일반환 {
    class Solution {
        public String solution(int a, int b) {
            String day = "" ;

            Calendar calendar = Calendar.getInstance();
            calendar.set(2016,a -1,b);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            switch(dayOfWeek){
                case 1: day = "SUN";
                    break;
                case 2: day = "MON";
                    break;
                case 3: day = "TUE";
                    break;
                case 4: day = "WED";
                    break;
                case 5: day = "THU";
                    break;
                case 6: day = "FRI";
                    break;
                case 7: day = "SAT";
                    break;
            }
            return day ;
        }
    }
}
