package com.medoumcode;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CapitalesGame {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 7;
        int score = 0, index;
        String pays, capitale, user_answer;

        ArrayList<Integer> indexesAlreadyTaken = new ArrayList<>();

        String [][] data= getData();

        Scanner clavier = new Scanner(System.in);

        for(int i=0; i<NUMBER_OF_QUESTIONS; i++){

            do{
                Random random = new Random();
                index = random.nextInt(data.length);

            }while (indexesAlreadyTaken.contains(index));

            indexesAlreadyTaken.add(index);
            pays = data[index][0];
            capitale = data[index][1];

            System.out.println("Quelle est la capital de ce pays :" +pays);
            user_answer = clavier.nextLine();

            if(capitale.equalsIgnoreCase(user_answer)){
                System.out.println("Bonne reponse");
                score++;
            }else{
                System.out.println("Mauvaise reponse. Il fallait repondre "+capitale);
            }

        }
        System.out.println("C'est terminé , le score est :"+ score +"/"+NUMBER_OF_QUESTIONS);
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
