package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        //Date 년도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025 -> 실제출력 : " + legacyDate); //1900 + 되어서 출력됨
        // 이건 이제 안씀!

        //Calendar 월 오류(0월부터 시작)
        Calendar cal = Calendar.getInstance();
        cal.set(2025, 4,24);
        System.out.println("Calendar.set(2025,3,23) -> 실제 월 : " + cal.getTime());
    }
}
