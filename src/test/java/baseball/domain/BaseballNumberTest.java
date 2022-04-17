package baseball.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import baseball.common.Message;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@DisplayName("BaseballNumber class TEST")
class BaseballNumberTest {

    @DisplayName("BaseballNumber List 비교")
    @Test
    void ListEqualityTest(){
        BaseballNumber baseballNumber = new BaseballNumber("123");
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(baseballNumber.getBaseballNumberList(), numberList);
    }

    @DisplayName("숫자 아닌 문자가 포함된 값 입력시 IllegalArgumentException 발생")
    @Test
    void onlyNumberTest(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                        .isThrownBy(() -> new BaseballNumber("12a"))
                        .withMessageMatching(Message.MSG_EXCEPTION);
    }

    @DisplayName("3자리 숫자가 아닌 값 입력시 IllegalArgumentException 발생")
    @Test
    void threeDigitNumberTest(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new BaseballNumber("12"))
                .withMessageMatching(Message.MSG_EXCEPTION);
    }

    @DisplayName("0이 포함된 값 입력시 IllegalArgumentException 발생")
    @Test
    void notContainZeroTest(){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new BaseballNumber("120"))
                .withMessageMatching(Message.MSG_EXCEPTION);
    }
}