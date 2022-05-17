package com.medcode;

public class Personne {
    private int age;



    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
       if(age < 15){
           throw new IllegalArgumentException("L'age doit etre superieur à 15");
       }
    }
}
