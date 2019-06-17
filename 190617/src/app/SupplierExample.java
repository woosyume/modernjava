package app;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Supplier
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello ";
        System.out.println(helloSupplier.get() + "World");

        long start = System.currentTimeMillis();
        printIfValidIndex(0, getVeryExpensiveValue());
        printIfValidIndex(-1, getVeryExpensiveValue());
        printIfValidIndex(-2, getVeryExpensiveValue());
        System.out.println("It took " + ((System.currentTimeMillis() - start) / 1000 + " seconds."));
    }

    private static String getVeryExpensiveValue() {
        // Let's just say it has very expensive calculation here!
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "Aaron";
    }

    private static void printIfValidIndex(int number, String value) {
        if (number >= 0) {
            System.out.println("The value is " + value);
        } else {
            System.out.println("Invalid"); // 여기 들어오는 경우 value를 사용하지 않는다.
        }
    }
}