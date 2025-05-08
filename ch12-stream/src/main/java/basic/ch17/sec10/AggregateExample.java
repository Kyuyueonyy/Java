package basic.ch17.sec10;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //2의 배수 카운팅
        long count = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("2의 배수 개수 : " + count);

        //2의 배수 총합
        long sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수 총합 : " + sum);

        //2의 배수 평균
        /*
        average()는 반환값이 OptionalDouble 이므로 처음 변수 선언할 때도
        기본형인 int를 사용하면 안됨
        */

        //아니면 이렇게 OptionalDouble로 선언하고 .average()를 붙임
        // OptionalDouble avg = Arrays.stream(arr).average();
        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble(); //이걸 쓰니까 앞에 double로 받을 수 있는것
        System.out.println("2의 배수 평균 : " + avg);

        //2의 배수 중 최대값
        long max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("2의 배수 중 최대값 : " + max);

        //2의 배수 중 최소값
        long min = Arrays.stream(arr)
                .filter(n -> n%2 ==0)
                .min()
                .getAsInt();
        System.out.println("2의 배수 중 최소값 : " + min);

        //첫 번째 3의 배수
        long first = Arrays.stream(arr)
                .filter(n -> n%3 ==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수 : " + first);
    }
}
