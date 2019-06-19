package app;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        BigDecialToCurrency currency = bd -> "$" + bd.toString(); // Can infer the type from functional interface.
        System.out.println(currency.toCurrency(new BigDecimal("120.00")));
    }

    /**
     * BigDecialToCurrency
     */
    @FunctionalInterface
    public interface BigDecialToCurrency {
        String toCurrency(BigDecimal value);
    }
}