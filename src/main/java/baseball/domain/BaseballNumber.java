package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BaseballNumber {

    private List<Integer> baseballNumberList;

    public BaseballNumber(){
        this.baseballNumberList = new ArrayList<>();
    }

    public BaseballNumber(String inputStr) throws IllegalArgumentException{
        this.baseballNumberList = new ArrayList<>();
        if(validate(inputStr)){
            this.baseballNumberList = storeInputString(inputStr);
        }
    }

    /*public BaseballNumber(int inputNumber) {
        this.baseballNumberList = storeInputNumber(inputNumber);
    }*/

    private boolean validate(String inputString) {
        String regex = "^[1-9]{3}$";

        if(!Pattern.matches(regex, inputString)) {
            throw new IllegalArgumentException();
        }

        return true;
    }

    private int convertStringToNumber(String inputStr){
        return Integer.parseInt(inputStr);
    }

    private List<Integer> storeInputString(String inputStr){
        int inputNumber = convertStringToNumber(inputStr);
        numberToList(inputNumber);

        return baseballNumberList;
    }

    /*private List<Integer> storeInputNumber(int inputNumber){
        numberToList(inputNumber);

        return baseballNumberList;
    }*/

    private void numberToList(int inputNumber){
        String[] inputNumberArr = String.valueOf(inputNumber).split("");
        for (int i = 0; i < inputNumberArr.length; i++) {
            int digit = Integer.parseInt(inputNumberArr[i]);
            isValid(digit);
            baseballNumberList.add(digit);
        }
    }

    private void isValid(int digit){
        if(baseballNumberList.contains(digit)){
            throw new IllegalArgumentException();
        }
    }

    public int getDigitNumber(int sequence){
        return baseballNumberList.get(sequence);
    }

    public boolean isExist(int digit){
        return baseballNumberList.contains(digit);
    }

    public int getIndex(int digit){
        return baseballNumberList.indexOf(digit);
    }

    public int getSize(){
        return baseballNumberList.size();
    }

    public void addDigit(int digit){
        baseballNumberList.add(digit);
    }

    /*public void setBaseballNumberList(List<Integer> baseballNumberList) {
        this.baseballNumberList = baseballNumberList;
    }*/

}
