package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class BinaryStringTest {
    @Test
    public void toBinaryString() {
        BinaryString binaryString = new BinaryString();
        for (int value = 0; value < 20; value++) {
            String actualResult = binaryString.toBinaryString(value);
            String expectedResult = Integer.toBinaryString(value);

            Assert.assertEquals("Test failed with value: " + value,
                    actualResult, expectedResult);
        }
    }
}
