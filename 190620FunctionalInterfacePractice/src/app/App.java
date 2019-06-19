package app;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        BigDecialToCurrency currency = bd -> "$" + bd.toString(); // Can infer the type from functional interface.
        System.out.println(currency.toCurrency(new BigDecimal("120.00")));

        final invalidFunctionalInterface invalid = value -> value.toString(); // 타입 지정이 없기 
    }

    /**
     * BigDecialToCurrency
     */
    @FunctionalInterface
    public interface BigDecialToCurrency {
        String toCurrency(BigDecimal value);
    }

    @FunctionalInterface // 람다 표현식을 사용할 수 없는 예
    public interface invalidFunctionalInterface {
       <T> String translate(T value);
    }
}