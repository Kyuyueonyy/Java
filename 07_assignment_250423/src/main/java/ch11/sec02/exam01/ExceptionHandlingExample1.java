package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            //예외 메시지 출력
            String message = e.getMessage();
            System.out.println("예외 메시지 : " + message);
            //스택 추적 내용 출력
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

// data가 Null 일 경우 NullPointerException 발생하는 문제점

// try catch 문으로 예외 처리 코드 추가 완료