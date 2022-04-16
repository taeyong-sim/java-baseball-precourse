package baseball.ui;

import baseball.common.Message;
import camp.nextstep.edu.missionutils.Console;

public class Input {

    private Message message;

    public String inputNumber(){
        return Console.readLine();
    }
}
