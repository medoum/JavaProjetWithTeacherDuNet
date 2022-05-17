package com.medoum.quizgame;

import javax.swing.*;

public class GUIQuiz extends Quiz{


    public GUIQuiz(CaptalCityQuestionsGenerator generator) {
        super(generator);
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
