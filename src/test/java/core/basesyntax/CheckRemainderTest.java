package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class CheckRemainderTest {
    @Test(expected = ArithmeticException.class)
    public void checkDivisionRemainder() {
        Random random = new Random();
        CheckRemainder checkRemainder = new CheckRemainder();
        for (int value = -5; value < 10; value++) {
            int size = random.nextInt(10 + 1) + 5;
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(40 + 1) - 20;
            }

            int[] actualResult = checkRemainder.checkDivisionRemainder(array, value);
            int[] expectedResult = correctCheckDivisionRemainder(array, value);
            Assert.assertArrayEquals("Test failed with array: " + res(actualResult)
                    + "  exp: " + res(expectedResult)
                    + " and value: " + value, actualResult, expectedResult);
        }
    }


    private String res(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }

    private int[] correctCheckDivisionRemainder(int[] array, int value) {
        return Arrays.stream(array).filter(a -> a % value == 0).toArray();
    }
}
