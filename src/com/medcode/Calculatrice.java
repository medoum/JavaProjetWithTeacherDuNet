package com.medcode;

public class Calculatrice {
    private double resultat;

    public void additionner(double... nombres){
        for(double nombre : nombres){
            resultat += nombre;
        }
        }
    public double getResultat() {
        return resultat;
    }
}
