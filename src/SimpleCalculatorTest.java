import org.testng.annotations.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test //The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
        //There is a method called assertEquals in the JUnit library that can be used to check if two objects is equally defined or not.
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    public void testSub1and0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}