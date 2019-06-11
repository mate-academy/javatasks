package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class DiamondTest {

    @Test
    public void drawRhombus() {
        try {
            for (int maxSizeOfDiamond = 0; maxSizeOfDiamond < 10; maxSizeOfDiamond++) {
                StringStream actualPrintStream = new StringStream();
                StringStream expectedPrintStream = new StringStream();

                Diamond.drawDiamond(maxSizeOfDiamond, actualPrintStream);

                drawDiamondCorrectly(maxSizeOfDiamond, expectedPrintStream);


                Assert.assertEquals("Test failed with parameter: maxSize = " + maxSizeOfDiamond,
                        actualPrintStream.getPrintString(), expectedPrintStream.getPrintString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void drawDiamondCorrectly(int maxSize, PrintStream stream) {
        for (int i = 0; i < maxSize - 1; i++) {
            for (int n = 0; n <= maxSize - i; n++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }

        for (int i = maxSize - 1; i >= 0; i--) {
            for (int n = 0; n <= maxSize - i; n++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }
    }
}
