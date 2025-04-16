package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);

        System.out.println("모델: " + myCar.model);
        System.out.println("색상: " + myCar.color);
        System.out.println("속도: " + myCar.speed + "km/h");
    }
}
