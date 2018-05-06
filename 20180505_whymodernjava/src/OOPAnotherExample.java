
public class OOPAnotherExample {
	public static void main(String[] args) {
		final CalculatorService calculatorService = new CalculatorService(new Addition());
		final int additionResult = calculatorService.calculate(11, 4);
		System.out.println(additionResult);
		
		final int subtractionResult = calculatorService.calculate(11, 1);
		System.out.println(subtractionResult);
		
		final int multiplicationResult = calculatorService.calculate(11, 2);
		System.out.println(multiplicationResult);
		
		final int divisionResult = calculatorService.calculate(20, 4);
		System.out.println(divisionResult);
		
		final FpCalculatorService fpCalculatorService = new FpCalculatorService();
		//System.out.println("addition: " + fpCalculatorService.calculate(new Addition(), 11, 4));
		System.out.println("addition: " + fpCalculatorService.calculate((i1, i2) -> i1 + i2, 11, 4));
		
		System.out.println("subtraction: " + fpCalculatorService.calculate(new Subtraction(), 11, 1));
		System.out.println("multiplication: " + fpCalculatorService.calculate(new Multiolication(), 11, 2));
		System.out.println("division: " + fpCalculatorService.calculate(new Division(), 20, 4));
		
	}
}

interface Calculation {
	int calculate(int num1, int num2);
}

class Addition implements Calculation {

	@Override
	public int calculate(final int num1, final int num2) {
		return num1 + num2;
	}
}

class Subtraction implements Calculation {

	@Override
	public int calculate(final int num1, final int num2) {
		return num1 - num2;
	}
}
class Multiolication implements Calculation {

	@Override
	public int calculate(final int num1, final int num2) {
		return num1 * num2;
	}
}
class Division implements Calculation {

	@Override
	public int calculate(final int num1, final int num2) {
		return num1 / num2;
	}
}

class CalculatorService {
	private final Calculation calculation;
	
	public CalculatorService(Calculation calculation) {
		this.calculation = calculation;
	}

	public int calculate(int num1, int num2) {
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException();
		}
		
	}

//	public int calculate(char calculation, int num1, int num2) {
//		if (calculation == '+') {
//			return num1 + num2;
//		} else if (calculation == '-') {
//			return num1 - num2;
//		} else if (calculation == '*') {
//			return num1 * num2;
//		} else if (calculation == '/') {
//			return num1 / num2;
//		} else {
//			throw new IllegalArgumentException("Unknown calculation: " + calculation);
//		}
//	}
}

class FpCalculatorService {
	public int calculate(Calculation calculation, int num1, int num2) {
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException();
		}
		
	}
}