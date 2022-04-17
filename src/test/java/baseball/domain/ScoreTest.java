package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import baseball.service.CompareService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Score Class TEST")
class ScoreTest {

    @DisplayName("Score Total")
    @Test
    void scoreTotalTest(){
        BaseballNumber baseballNumber = new BaseballNumber("243");
        CompareService compareService = new CompareService(new BaseballNumber("123"), baseballNumber);
        Score score = compareService.countTotal(baseballNumber);
        assertEquals(score.getTotal(), 2);
    }

    @DisplayName("Score Strike")
    @Test
    void scoreStrikeTest(){
        BaseballNumber baseballNumber = new BaseballNumber("243");
        CompareService compareService = new CompareService(new BaseballNumber("123"), baseballNumber);
        Score score = compareService.countStrike(baseballNumber);
        assertEquals(score.getStrike(), 1);
    }
}