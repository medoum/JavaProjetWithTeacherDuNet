package com.medcode;

public class PersonneTest {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        try {
            p1.setAge(14);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
