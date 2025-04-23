package lecture.exception.section01;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        ExceptionTest et= new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("물건의 가격을 입력해주세요: ");
        int price = sc.nextInt();
        System.out.println();

        /*
        * 예외 처리 방법
        * -> try-catch 처리
        * */

        try {
            et.checkEnoughMoney(1000, 5000);
            System.out.println("==========상품 구입 가능===========");
        } catch (Exception e) {
            System.out.println("==========상품 구입 불가능===========");

            // finally: 예외 처리와 상관없이 반드시 수행되는 구문
            // 일반적으로 자원 반납시 많이 사용함
        } finally {
            sc.close();
        }
        System.out.println("프로그램 종료");
    }
}
