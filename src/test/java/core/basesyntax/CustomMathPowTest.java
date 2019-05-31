package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class CustomMathPowTest {

	@Test
	public void pow() {
		for (int number = 0, exponential = 10; number < 10 && exponential > 0; number++, exponential--) {
			CustomMathPow customMathPow = new CustomMathPow();
			int studentResult = customMathPow.pow(number, exponential);
			int correctResult = (int) Math.pow(number, exponential);


			Assert.assertEquals("Test failed with number = " + number
							+ " and exponential = " + exponential, studentResult, correctResult);
		}
	}
}