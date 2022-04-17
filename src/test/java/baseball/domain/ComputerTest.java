package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Computer Class TEST")
class ComputerTest {

    @DisplayName("Computer 초기화")
    @Test
    void computerInitTest(){
        Computer computer = new Computer();
        assertNotNull(computer.generateRandomNumber());
    }

    @DisplayName("Computer 숫자 Size")
    @Test
    void computerRandomNumberSizeTest(){
        Computer computer = new Computer();
        BaseballNumber computerNumber = computer.generateRandomNumber();
        assertEquals(computerNumber.getSize(), 3);
    }

}