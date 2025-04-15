package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // new : heap 영역에 공간을 만드는 역할
        // Scanner : 덩어리!
        // Stack 영역에 sc라는 이름으로 주소값을 저장
        // 사용할 때는 sc.~ 참조연산자로 사용
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("x값 입력 : ");
            String str = sc.nextLine();

            if (str.equals("q")) {
                break;
            }

            System.out.println("입력값 = " + str);
        }

        // 스캐너 사용 후에는 닫아주는 습관!
        System.out.println("종료");
        sc.close();
    }
}
