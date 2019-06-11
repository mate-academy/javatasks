package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class FootballMatchTest {

    @Test
    public void matchScore() {
        FootballMatch footballMatch = new FootballMatch();
        for (int firstRealResult = 1; firstRealResult < 5; firstRealResult++) {
            for (int secondRealResult = 1; secondRealResult < 5; secondRealResult++) {
                for (int firstBetResult = 1; firstBetResult < 5; firstBetResult++) {
                    for (int secondBetResult = 1; secondBetResult < 5; secondBetResult++) {
                        int actualResult =
                                footballMatch.matchResult(firstRealResult, secondRealResult, firstBetResult, secondBetResult);
                        int expectedResult
                                = footballMatchResult(firstRealResult, secondRealResult, firstBetResult, secondBetResult);


                        Assert.assertEquals("Test failed with parameters = "
                                + firstRealResult + ", "
                                + secondRealResult + ", "
                                + firstBetResult + ", "
                                + secondBetResult, actualResult, expectedResult);
                    }
                }
            }
        }
    }

    private int footballMatchResult(int firstRealResult, int secondRealResult, int firstBetResult, int secondBetResult) {
        return (firstRealResult == firstBetResult && secondRealResult == secondBetResult) ? 2 :
                (firstBetResult == secondRealResult && firstBetResult == secondBetResult) ||
                        (firstRealResult < secondRealResult && firstBetResult < secondBetResult) ||
                        (firstRealResult > secondRealResult && firstBetResult > secondBetResult) ? 1 : 0;
    }
}
