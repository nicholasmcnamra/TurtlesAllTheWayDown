import org.junit.Test;
import org.junit.Assert;
public class GCDTests {

    @Test
    public void GCDLoopTest1() {
        GCD gcd = new GCD();
        long expectedResult = 50;
        long actualResult = gcd.GCDLoop(100, 50);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GCDRecursiveTest1() {
        GCD gcd = new GCD();
        long expectedResult = 50;
        long actualResult = gcd.GCDRecursive(100, 50);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GCDLoopTest2() {
        GCD gcd = new GCD();
        long expectedResult = 12;
        long actualResult = gcd.GCDLoop(228, 24);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GCDRecursiveTest2() {
        GCD gcd = new GCD();
        long expectedResult = 12;
        long actualResult = gcd.GCDRecursive(228, 24);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GCDLoopTest3() {
        GCD gcd = new GCD();
        long expectedResult = 34;
        long actualResult = gcd.GCDLoop(102, 68);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GCDRecursiveTest3() {
        GCD gcd = new GCD();
        long expectedResult = 34;
        long actualResult = gcd.GCDRecursive(102, 68);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void timeElapsedTest() {
        GCD gcd = new GCD();
        long loopTime = gcd.GCDLoopTime(1298735078, 129);
        long recursiveTime = gcd.GCDRecursiveTime(1298735078, 129);

        boolean duration = loopTime > recursiveTime;
        System.out.printf("Loop time: %d\n", loopTime);
        System.out.printf("Recursive time: %d", recursiveTime);
        Assert.assertTrue(duration);
    }
}
