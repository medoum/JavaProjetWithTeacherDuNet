package com.medoum.quizgame;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz{
    Scanner clavier = new Scanner(System.in);
    public ConsoleQuiz(int nbreQuestions) {
        super(nbreQuestions);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String retrieveAnswer(String prompt) {
        displayMessage(prompt);
        return clavier.nextLine();
    }
}
