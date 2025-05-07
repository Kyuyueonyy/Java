package advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        /*
         * 메소드 참조
         * 함수형 인터페이스를 람다식으로 쓰는게 아닌, 일반 메소드를 참조시켜 선언하는 방법
         * 일반 메소드를 참조하기 위한 조건
         * 각 메소드의 매개변수 타입/갯수/반환형이 같아야함
         *
         * - static인 경우
         * 클래스이름::메소드이름
         *
         * - instance인 경우
         * 참조변수이름::메소드이름
         * */

        //정적 메소드일 경우
        //람다식
        //person.action((x,y) -> Computer.staticmethod(x,y));
        //메소드 참조
        person.action(Computer::staticMethod);

        //인스턴스 메소드일 경우
        Computer com = new Computer();
        //람다식
        //person.action((x,y) -> com.instanceMethod(x,y));
        //메소드 참조
        person.action(com::instanceMethod);
    }
}
