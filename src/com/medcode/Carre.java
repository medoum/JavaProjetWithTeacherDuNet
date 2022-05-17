package com.medcode;

public class Carre implements Forme{
    protected int cote = 4;
    protected String nom ;
    protected String nomFemme;
    public Carre(String nom , int cote){
        this.cote = cote;
        this.nom = nom;
    }
    public Carre(String nom, int cote, String nomFemme) {
        this(nom, cote);
        this.nomFemme = nomFemme;
    }
    @Override
    public double aire() {
        return cote * cote;
    }
}
