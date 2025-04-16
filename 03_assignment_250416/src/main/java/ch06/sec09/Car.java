package ch06.sec09;

public class Car {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    Car(String model) {
        this.model=model;
    }

    //메서드 선언
    //speed필드의 getter메서드 정의
    void setSpeed(int speed) {
        this.speed = speed;
    }

    //speed필드의 setter메서드 정의
    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}
