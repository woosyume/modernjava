package app;

import java.util.function.Consumer;

/**
 * ConsumerExample
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = new Consumer<String>(){
        
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };

        print.accept("Hi, Aaron");

        // Simplify
        Consumer<String> greetings = value -> System.out.println("Hello " + value);
        greetings.accept("Aaron");
    }
}