package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {

        double pi = Calculator.pi;

        System.out.println(pi);

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
        cal1.pi = 15;

        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);
        System.out.println("cal2.pi : " + cal2.pi);

//        System.out.println();
        //인스턴스를 만들지 않아도클래스 이름. " " 으로 참조할 수 있음
        //System.out.println(Calculator.plus((int) pi, 5));
    }
}
