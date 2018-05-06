package main;

import java.util.function.Function;

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
	}
}
