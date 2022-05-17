package com.medcode;

public class Triangle implements Forme{
    protected double base = 4;
    protected double hauteur = 2;


    public double aire(){
        return base * hauteur * 0.5;
    }

}
