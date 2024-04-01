import java.time.Duration;
import java.time.Instant;

public class Factorial {
    public Factorial(){

    }

    public long factorialLoop(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public long factorialRecursive(long n) {
        if (n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public long factorialLoopTime(long n) {
        Instant start = Instant.now();
        factorialLoop(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }

    public long factorialRecursiveTime(long n) {
        Instant start = Instant.now();
        factorialRecursive(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }
}
