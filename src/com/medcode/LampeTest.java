package com.medcode;

public class LampeTest {
    public static void main(String[] args) {
    Lampe lampe = new Lampe(true);
    Interrupteur interrupteur = new Interrupteur(lampe);

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());

        interrupteur.presser();

        System.out.println(lampe.estAllumee());
        System.out.println(interrupteur.getPosition());
    }
}

