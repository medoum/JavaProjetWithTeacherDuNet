package com.medcode;

public class CalculatriceTest {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        calculatrice.additionner(6, -2, 8, 8);
        System.out.println(calculatrice.getResultat());
    }
}
