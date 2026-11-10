package com.example.pruebaActions.testActions;

public class CodeSmellExample {

    public String getMessage(int option) {
        if (option == 1) {
            return "This message is duplicated";
        }

        if (option == 2) {
            return "This message is duplicated";
        }

        return "This message is duplicated";
    }

    public void unusedVariableExample() {
        String unusedMessage = "This variable is never used";
    }

    public void emptyCatchExample() {
        try {
            throw new IllegalArgumentException("Test exception");
        } catch (IllegalArgumentException exception) {
        }
    }
}
