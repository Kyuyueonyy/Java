package basic.ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });
        //리턴문이 하나만 있을 경우(연산식)
        //person.action((x, y) -> {
        // return (x + y);
        //});
        person.action((x, y) -> (x + y));
        //리턴문이 하나만 있을 경우(메소드호출)
        //person.action((x, y) -> {
        // return sum(x, y);
        //});

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
        person.action(LambdaExample::sum);
        //person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}