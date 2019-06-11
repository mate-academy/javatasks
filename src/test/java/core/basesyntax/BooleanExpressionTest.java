package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class BooleanExpressionTest {

    @Test
    public void booleanExpression() {
        BooleanExpression expression = new BooleanExpression();

        for (int aInt = 0; aInt < 2; aInt++) {
            boolean a = aInt == 0;
            for (int bInt = 0; bInt < 2; bInt++) {
                boolean b = bInt == 0;
                for (int cInt = 0; cInt < 2; cInt++) {
                    boolean c = cInt == 0;
                    for (int dInt = 0; dInt < 2; dInt++) {
                        boolean d = dInt == 0;

                        boolean actualResult = expression.booleanExpression(a, b, c, d);
                        boolean expectedResult = correctBooleanExpression(a, b, c, d);

                        Assert.assertEquals("Test failed with parameter: a = " + a
                                + " b = " + b + " c = " + c + " d = " + d, actualResult, expectedResult);
                    }
                }
            }
        }
    }

    private boolean correctBooleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) && (c ^ d) || (a ^ c) && (b ^ d);
    }
}
