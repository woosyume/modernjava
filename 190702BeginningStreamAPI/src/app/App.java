package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        final int abs1 = Math.abs(-1);
        final int abs2 = Math.abs(1); // 복수의 입력값이 같은 결과값을 같은 예시

        System.out.println(abs1 == abs2);

        final List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(
            mapOld(numbers, i -> i*2)
        );

        System.out.println(
            // map(numbers, null) <- map(numbers, i -> i) 이것과 같다. null을 신경쓰지 않아도 된다.
            mapOld(numbers, i -> i*2)
        );
    }

    private static <T, R> List<R> mapOld(List<T> list, Function<T, R> mapper) {
        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            if (mapper != null) {
                result.add(mapper.apply(t));
            }
        }
        return result;
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        final Function<T, R> function;

        if (mapper != null) {
            function = mapper;
        } else {
            function = t -> (R) t; // identity function의 예이긴 한데 캐스팅이 있는 것 부터 마음에 들지 않는다.
        }

        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}