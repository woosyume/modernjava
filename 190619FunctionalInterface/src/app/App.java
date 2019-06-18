package app;

public class App {
    public static void main(String[] args) throws Exception {
        println(1, 2, 3, (i1, i2, i3) -> String.valueOf(i1 + i2 + i3));
    }

    private static <T1, T2, T3> void println(T1 t1, T2 t2, T3 t3, Function3<T1, T2, T3, String> function) {
        System.out.println(function.apply(t1, t2, t3));
    }
    
    @FunctionalInterface
    public interface Function3<T1, T2, T3, R> {
        R apply(T1 t1, T2 t2, T3 t3); 
    }
}
