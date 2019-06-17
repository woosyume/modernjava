package app;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService(new Addition());
        int result = service.calculate(1, 1);
        System.out.println(result);

        final FunctionalCalculatorService service2 = new FunctionalCalculatorService();
        int result2 = service2.calculate(new Addition(), 20, 2);
        System.out.println(result2);

        // From Java 8
        int result3 = service2.calculate((i1, i2) -> i1 + i2, 20, 2);
        System.out.println(result3);
    }
}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class CalculatorService {
    private final Calculation calculation;
    public CalculatorService(final Calculation calculation) {
        this.calculation = calculation;
    }
    public int calculate(int num1, int num2) {
        return calculation.calculate(1, 1);
    } 
}

// ver. Functional Programming

class FunctionalCalculatorService {
    public int calculate(Calculation calculation, int num1, int num2) {
        if (num1 > 10) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException();
        }
    }
}

/**
 * 
 * First Class Citizen
 * 
 */
