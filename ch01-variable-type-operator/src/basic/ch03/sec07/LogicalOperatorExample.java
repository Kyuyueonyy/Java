package basic.ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        // int charCode = 'a';
        // int charCode = '5';

        // 대문자인 경우
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자이군요.");
        }

        // 소문자인 경우
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자이군요.");
        }

        // 숫자인 경우
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자이군요.");
        }

        //----------------------------------

        int value = 6;
        // int value = 7;

        // 2 또는 3의 배수인 경우
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.");
        }

        // 2 또는 3의 배수가 아닌 경우
        boolean result = (value % 2 == 0) || (value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }
    }
}
