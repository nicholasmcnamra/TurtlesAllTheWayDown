import java.time.Duration;
import java.time.Instant;

public class GCD {
    public GCD() {
    }

    public long GCDLoop(long p, long q) {
        while (q != 0) {
            long temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public long GCDRecursive(long p, long q) {
        if (q == 0)
            return p;
        return GCDRecursive(q, p % q);
    }

    public long GCDLoopTime(long p, long q) {
        Instant start = Instant.now();
        GCDLoop(p, q);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }

    public long GCDRecursiveTime(long p, long q) {
        Instant start = Instant.now();
        GCDRecursive(p, q);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        return timeElapsed;
    }

}
