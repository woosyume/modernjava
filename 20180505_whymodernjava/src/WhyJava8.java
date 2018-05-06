import java.util.Arrays;
import java.util.List;

public class WhyJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		final StringBuilder stringBuilder = new StringBuilder();
		for (int number : numbers) {
			stringBuilder.append(number).append(" : ");
		}
		if (stringBuilder.length() > 0 ) {
			
		}
		System.out.println(stringBuilder.toString());
		
		//1.8 Style
//		final String result = numbers.stream()
//				.map(String::valueOf) // '매핑'의 맵
//				.collect(joining(" : "));
	}

}
