package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        //자식 타입 객체 생성
        Child child = new Child();

        //부모타입 -> child를 업캐스팅
        Parent parent = child; //다형성
        parent.method1(); // Parent-method1()
        parent.method2(); // Child-method2()
        //parent.method3();
        //Parent 에는 method3이 정의되어있지 않음!!
    }
}