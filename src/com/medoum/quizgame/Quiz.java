package com.medoum.quizgame;

import com.medoum.quizgame.utils.TimeCoverter;

import java.util.Scanner;

abstract public class Quiz {
        private CaptalCityQuestionsGenerator generator;
        private int score;
        private long timeElapsed;
        Scanner clavier = new Scanner(System.in);
        private boolean done = false;

        public Quiz(CaptalCityQuestionsGenerator generator){
            this.generator = generator;
        }
        abstract public void displayMessage(String message);
        abstract public String retrieveAnswer(String prompt);

        public void start(){
            try {
                long startTime = System.currentTimeMillis();
                for (Question question :
                        generator.generate()) {
                   String userAnswer = retrieveAnswer(question.getText());

                    if(userAnswer.equalsIgnoreCase(question.getResponse())){
                        score++;
                        System.out.println(" Bonne reponse ");
                    }else{
                        displayMessage("Mauvaise reponse !");
                        displayMessage("La bonne reponse etait " +question.getResponse());
                    }
                    done = true;
                    long endTime = System.currentTimeMillis();
                    timeElapsed = (endTime - startTime);
                }
            }catch (IllegalArgumentException e){
                done = false;
                System.out.println(e.getMessage());
            }
        }

        public void display() {
            if (done) {
                displayScore();
                displayTimeElapsed();
            }
        }
        private void displayTimeElapsed() {
            displayMessage("Il a vous fallu environ "+ TimeCoverter.toSeconds(timeElapsed)+ " secondes" +
                    " pour repondre aux "+ generator.getNbrQuestions()+" questions.");
        }
        private void displayScore() {
            displayMessage("Votre score finale est de :" +score+"/"+generator.getNbrQuestions());
        }


    }


