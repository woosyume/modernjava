package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {
	public static void main(String[] args) {
		// existing
		//		Function<String, Integer> toInt = new Function<String, Integer>() {
//			@Override
//			public Integer apply(final String value) {
//				return Integer.parseInt(value);
//			}
//		};
		// Java 1.8
		Function<String, Integer> toInt = (value) ->  // String이라고 이미 정의했기 때문에 또 적어줄 필요가 없다.
				//return Integer.parseInt(value); 
			// return도 불필요하다. 이미 지정했기 때문에.
			Integer.parseInt(value);
				
		
		final Integer number = toInt.apply("100");
		System.out.println(number); 
		
		//값에 손대지 않고 그대로 리턴
		//final Function<Integer, Integer> identity = Function.identity();
		final Function<Integer, Integer> identity = t -> t; //이것도 같다. T타입 받아서 T타입을 리턴한다.
		System.out.println(identity.apply(999));
		
		///////Consumer///////
		// 1.7
//		final Consumer<String> print = new Consumer<String>() {
//
//			@Override
//			public void accept(final String value) {
//				System.out.println(value);
//			}
//		};
		
		// 1.8
		final Consumer<String> print = value -> System.out.println(value);
		//final Function<String, Void> print2 = value -> System.out.println(value);
		
		print.accept("Hello");
		
		final Predicate<Integer> isPositive = i -> i > 0;
		System.out.println(isPositive.test(0)); // In Scala, we can use 'isPositive(1)'.
		System.out.println(isPositive.test(-1));
		System.out.println(isPositive.test(2));
		
		// Why Predicate, not Function?
		List<Integer> numbers = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
		List<Integer> positiveNumbers = new ArrayList<>();
		for (Integer integer : numbers) {
			if (isPositive.test(integer)) { // 이 부분만 다른 경우, 대개 복붙을 통해 이 부분만 수정하여 여러 개의 메소드를 선언하고 만다.
				positiveNumbers.add(integer);
			}
		}
		
		//System.out.println("positive numbers: " + positiveNumbers);
		System.out.println("positive numbers: " + filter(positiveNumbers, isPositive));
		
		//너무 반복되니 아래와 같은 메소드를 선언할 수 있다.
		}
	
	private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
		List<T> result = new ArrayList<>();
		for (T input : list) {
			result.add(input);
		}
		return result;
	}
	
	
}
