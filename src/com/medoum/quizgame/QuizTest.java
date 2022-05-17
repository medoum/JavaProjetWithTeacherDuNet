package com.medoum.quizgame;

public class QuizTest {
    public static void main(String[] args) {
      Quiz quiz = new GUIQuiz(new CaptalCityQuestionsGenerator(5));
      quiz.start();
      quiz.display();


    }
}
