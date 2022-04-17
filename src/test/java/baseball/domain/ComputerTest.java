package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Computer Class TEST")
class ComputerTest {

    Computer computer;

    @BeforeEach
    void init(){
        computer = new Computer();
    }

    @DisplayName("Computer 초기화")
    @Test
    void computerInitTest(){
        assertNotNull(computer.generateRandomNumber());
    }

    @DisplayName("Computer 숫자 Size")
    @Test
    void computerRandomNumberSizeTest(){
        BaseballNumber computerNumber = computer.generateRandomNumber();
        assertEquals(computerNumber.getSize(), 3);
    }

}