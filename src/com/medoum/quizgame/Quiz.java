package com.medoum.quizgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

abstract public class Quiz {

        private int score;
        private long timeElapsed;
        Scanner clavier = new Scanner(System.in);
        private int nbreQuestions;
        private boolean done = false;

        public Quiz(int nbreQuestions){
            this.nbreQuestions = nbreQuestions;
        }
        abstract public void displayMessage(String message);
        abstract public String retrieveAnswer(String prompt);

        public void start(){
            try {
                long startTime = System.currentTimeMillis();
                for (Question question :
                        generate(nbreQuestions)) {
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
        private int getTimeElapsedInSeconds(long timeInMillisecond) {
            return (int) (timeInMillisecond / 1000);
        }
        public void display() {
            if (done) {
                displayScore();
                displayTimeElapsed();
            }
        }
        private void displayTimeElapsed() {
            displayMessage("Il a vous fallu environ "+ getTimeElapsedInSeconds(timeElapsed)+ " secondes" +
                    " pour repondre aux "+ nbreQuestions+" questions.");
        }
        private void displayScore() {
            displayMessage("Votre score finale est de :" +score+"/"+nbreQuestions);
        }

        public ArrayList<Question> generate(int nombreQuestions){
            String [][] data = getData();
            if(nombreQuestions > data.length){
                throw new IllegalArgumentException("On ne peut generer que " +data.length+ " questions maximum.");
            }
            ArrayList<Question> questions = new ArrayList<>();
            int index;
            ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();

            for(int i=0; i<nombreQuestions; i++) {
                do {
                    Random random = new Random();
                    index = random.nextInt(data.length);

                } while (indexesAlreadyTaken.contains(index));
                indexesAlreadyTaken.add(index);

                String pays = data[index][0];
                String capitale = data[index][1];

                questions.add( new Question("Quelle est la capitale de " + pays, capitale));
            }
            return questions;
        }
        private static String[][] getData(){
            String [][] data = {
                    {"Senegal", "Dakar"},
                    {"France", "Paris"},
                    {"Nigeria", "Abuja"},
                    {"Gabon", "Libreville"},
                    {"Allemagne", "Berlin"},
                    {"Italie", "Rome"},
                    {"Monaco", "Monaco"},
                    {"Liberia", "Monrovia"},
                    {"Perou", "Lima"}
            };
            return data;
        }
    }


