package app;

import java.util.function.Function;

/**
 * FunctionalInterfaceExample
 */
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // 인터페이스인데 그 안에 추상인터페이스가 하나만 존재.
        // 람다 표현식을 사용하기 위해 필요한 인터페이스
        // 람다 표현식의 타입이 함수형 인터페이스
        // identity function : 인풋과 같은 타입의 리턴(변형없이 그대로)
        
        Function<String, Integer> toInt = value -> Integer.parseInt(value);
        
        int number = toInt.apply("10");
        System.out.println(number);

        Function<Integer, Integer> identity = Function.identity();
        Function<Integer, Integer> identity2 = t -> t;

        System.out.println(identity2.apply(999));
    }
}