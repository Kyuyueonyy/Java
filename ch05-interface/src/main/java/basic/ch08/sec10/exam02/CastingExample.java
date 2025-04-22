package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //이렇게 호출할 수 없음!
        //checkFare는 Vehicle에 없는 기능이므로!
        //vehicle.checkFare();

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
