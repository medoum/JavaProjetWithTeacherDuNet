package com.medoum.quizgame;

public class QuizTest {
    public static void main(String[] args) {
      Quiz quiz = new ConsoleQuiz(2);
      quiz.start();
      quiz.display();


    }
}
