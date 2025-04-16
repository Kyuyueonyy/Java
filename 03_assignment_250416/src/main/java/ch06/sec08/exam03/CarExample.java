package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        myCar.setGas(5);

        //isLeftGas() 호출해서 리턴값 true면 반복문
        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
