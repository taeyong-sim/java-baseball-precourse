package baseball.controller;

import baseball.common.Message;
import baseball.domain.BaseballNumber;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.Score;
import baseball.service.CompareService;
import baseball.service.JudgeService;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGameController {

    private static final int NEW_GAME = 1;
    private static final int QUIT_GAME = 2;
    private static final String ON_STATE = "ON";
    private static final String OFF_STATE = "OFF";
    private static final int STRIKE_OUT = 3;

    private static Computer computer;
    private static Player player;
    private static Score score;
    private static Message message;
    private static JudgeService judgeService;

    private static String state;

    public static void run(){
        initBaseballGame();
        while(!OFF_STATE.equals(state)){
            inputNumber();
            printJudgement();
            confirmResult();
        }
    }

    private static void initBaseballGame(){
        state = ON_STATE;
        computer = new Computer();
        player = new Player();
        message = new Message();
    }

    private static void inputNumber(){
        message.printMessage(Message.MSG_INPUT);
        String input = Console.readLine();
        player.setBaseballNumber(new BaseballNumber(input));
    }

    private static void printJudgement(){
        CompareService compareService = new CompareService(computer.getComputerNumber(), player.getBaseballNumber());
        score = compareService.getScore();
        judgeService = new JudgeService();
        String result = judgeService.judgeResult(compareService, computer.getComputerNumber(), player.getBaseballNumber());
        message.printMessage(result + "\n");
    }

    private static void confirmResult(){
        if(score.getStrike() == STRIKE_OUT){
            state = OFF_STATE;
            message.printMessage(Message.MSG_WIN);
            determineGame();
        }
    }

    private static int askGameContinue() throws IllegalArgumentException{
        message.printMessage(Message.MSG_ASK);
        return Integer.parseInt(Console.readLine());
    }

    private static void determineGame(){
        int choice = askGameContinue();

        if(choice == NEW_GAME){
            initBaseballGame();
        }
        if(choice == QUIT_GAME){
            state = OFF_STATE;
        }
    }

}
