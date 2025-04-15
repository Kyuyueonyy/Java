package basic.ch04.sec02;

//Random은 외부 클래스 이므로 외부에서 import 해와야함.
import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {

        //1~6사이의 값을 랜덤하게 추출
        //Math.random() 은 0.0~1.0 사이의 난수 생성
        //-> double 형태로 반환하기 때문에 (int)로 강제 형변환

        int num = ((int) (Math.random() * 6)) + 1;

        //Random 클래스 사용!
        //heap 공간에 Random 넣고 주소값을 stack에 넣음
        Random rand = new Random();
        //0부터 인수(bound)로 준 값 미만까지 출력 + 1 = 0~5+1 = 0~6 까지 출력
        num = rand.nextInt(6) + 1;


        if (num == 1) {
            System.out.println("1이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2가 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4가 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5가 나왔습니다.");
        } else if (num == 6) {
            System.out.println("6이 나왔습니다.");
        }
    }
}
