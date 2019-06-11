package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class FlipBitTest {
    @Test
    public void flipBit() {
        FlipBit flipBit = new FlipBit();
        for (int value = 5; value < 20; value++) {
            for (int bitIndex = 0; bitIndex < 5; bitIndex++) {
                int actualResult = flipBit.flipBit(value, bitIndex);
                int expectedResult = correctFlipBit(value, bitIndex);

                Assert.assertEquals("Test failed with parameter: value = " + value
                        + " bitIndex = " + bitIndex, actualResult, expectedResult);
            }
        }
    }

    private int correctFlipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
