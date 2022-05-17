package com.medcode;

public class HeritageTest {
    public static void main(String[] args) {
        Forme [] tab = new Forme[3];

        tab[0] = new Carre("toto", 3);
        tab[1] = new Triangle();
        tab[2] = new Cercle();

        for( Forme forme : tab){
            System.out.println(forme.aire());
        }


    }
}
