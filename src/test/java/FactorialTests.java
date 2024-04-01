import org.junit.Test;
import org.junit.Assert;

public class FactorialTests {

    @Test
    public void factorialLoopTest1() {
        Factorial factorial = new Factorial();
        long expectedResult = 120;
        long actualResult = factorial.factorialLoop(5);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialRecursiveTest1() {
        Factorial factorial = new Factorial();
        long expectedResult = 120;
        long actualResult = factorial.factorialRecursive(5);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialLoopTest2() {
        Factorial factorial = new Factorial();
        long expectedResult = 2004310016;
        long actualResult = factorial.factorialLoop(15);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialRecursiveTest2() {
        Factorial factorial = new Factorial();
        long expectedResult = 2004310016;
        long actualResult = factorial.factorialRecursive(15);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialLoopTest3() {
        Factorial factorial = new Factorial();
        long expectedResult = 39916800;
        long actualResult = factorial.factorialLoop(11);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialRecursiveTest3() {
        Factorial factorial = new Factorial();
        long expectedResult = 39916800;
        long actualResult = factorial.factorialRecursive(11);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void timeElapsedTest() {
        Factorial factorial = new Factorial();
        long loopTime = factorial.factorialLoopTime(800);
        long recursiveTime = factorial.factorialRecursiveTime(800);

        boolean duration = loopTime > recursiveTime;
        System.out.printf("Loop time: %d\n", loopTime);
        System.out.printf("Recursive time: %d", recursiveTime);
        Assert.assertFalse(duration);
    }

    @Test
    public void timeElapsedTest1() {
        Factorial factorial = new Factorial();
        long loopTime = factorial.factorialLoopTime(20);
        long recursiveTime = factorial.factorialRecursiveTime(20);

        boolean duration = loopTime > recursiveTime;
        System.out.printf("Loop time: %d\n", loopTime);
        System.out.printf("Recursive time: %d", recursiveTime);
        Assert.assertTrue(duration);
    }
}
