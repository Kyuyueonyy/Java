package ch06.sec10.exam01;

public class Calculator {
    //정적 필드
    static double pi=3.14159;

    int z;

    //정적 메서드
    static int plus(int x, int y) {
        return x+y;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "z=" + z +
                '}';
    }
}
