package lecture.problem;

public class KindsOfVariable {

    /*
    * 클래스 영역( { } 사이) 에 작성하는 변수 = 필드
    * 필드 == 멤버변수 == 전역변수(클래스 전역에서 사용가능한 변수
    *
    * */

    // 인스턴스 변수 : non-static 필드를 의미
    // --> 인스턴스 생성 시점에 사용가능한 변수라는 의미
    private int globalNum;

    // 정적 필드 == 클래스 변수 : static 필드를 의미
    private static int staticNum;

    public void testMethod(int 매개변수) {
        /*
        * 지역변수 : 메소드 영역에서 작성하는 변수
        * -> 매개변수도 일종의 지역변수다. (메소드 바깥에서 쓸 수 없으니까)*/
        int local;
    } //메소드 영역 끝

} //클래스 영역 끝
