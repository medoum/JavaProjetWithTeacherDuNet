package com.medoum.quizgame;

import javax.swing.*;

public class GUIQuiz extends Quiz{

    public GUIQuiz(int nbreQuestions) {
        super(nbreQuestions);
    }

    @Override
    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String retrieveAnswer(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
}
