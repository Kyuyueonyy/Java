package basic.ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        //rc 변수에 Television 객체 대입
        rc = new Television();
        rc.turnOn();

        //rc 변수에 Audiot 객체 대입
        rc = new Audiot();
        rc.turnOn();
    }
}
