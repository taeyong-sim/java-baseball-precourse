package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Player class TEST")
class PlayerTest {

    @DisplayName("player 초기화")
    @Test
    void initPlayer(){
        Player player = new Player();
        BaseballNumber baseballNumber = new BaseballNumber("123");
        player.setBaseballNumber(baseballNumber);
        assertEquals(new ArrayList<>(Arrays.asList(1,2,3)), player.getBaseballNumber().getBaseballNumberList());
    }
}