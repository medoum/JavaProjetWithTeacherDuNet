package com.medcode;

public class CompteBancaire{
    private String numeroCompte;
    private String nomProprietaire;
    private int solde = 0;

    public CompteBancaire(String numeroCompte, int solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    @Override
    public String toString() {
        return "CompteBancaire: \n" +
                "numeroCompte: " + numeroCompte + " " +
                ", solde : " + solde ;
    }
}
