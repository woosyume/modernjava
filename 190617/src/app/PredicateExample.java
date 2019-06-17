package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * PredicateExample
 */
public class PredicateExample {

    // 어떤 결과값이 주어진 조건에 만족 하는지 확인할 때 자주 사용
    public static void main(String[] args) {
        Predicate<Integer> isPositive = i -> i > 0;

        System.out.println(isPositive.test(1));
        System.out.println(isPositive.negate().test(1));

        List<Integer> numbers = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);

        System.out.println(filter(numbers, isPositive));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T input : list) {
            if (filter.test(input)) {
                result.add(input);
            }
        }
        return result;
    }
}