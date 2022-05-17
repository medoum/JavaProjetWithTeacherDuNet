package com.medoum.quizgame;

import java.util.ArrayList;
import java.util.Random;

public class CaptalCityQuestionsGenerator {
    private int nbrQuestions;
    public CaptalCityQuestionsGenerator(int nbrQuestions) {
        this.nbrQuestions = nbrQuestions;
    }
    public int getNbrQuestions(){
        return nbrQuestions;
    }
    public ArrayList<Question> generate(){
        String [][] data = getData();
        if(nbrQuestions > data.length){
            throw new IllegalArgumentException("On ne peut generer que " +data.length+ " questions maximum.");
        }
        ArrayList<Question> questions = new ArrayList<>();
        int index;
        ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();

        for(int i=0; i<nbrQuestions; i++) {
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
