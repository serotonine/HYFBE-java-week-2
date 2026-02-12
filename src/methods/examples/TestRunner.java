package methods.examples;

public class TestRunner {


    //we're not catching our errors for now, only we are aware of our code if it doesn't run!
    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            System.out.println("FAIL: expected " + expected + " but got " + actual);
            return;
        }
        System.out.println("PASS");
    }

    static void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
}
