package com.cda2.classe;

public class Habitation {
    /*-------------------------------------------
                    Attributs
    -------------------------------------------*/
    private String nom;
    private double longueur;
    private double largeur;
    private int nbrEtage = 1;

    /*-------------------------------------------
                    constructeurs
    -------------------------------------------*/
    public Habitation(){}
    public Habitation(String nom, double longueur, double largeur){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Habitation(String nom, double longueur, double largeur, int nbrEtage) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtage = nbrEtage;
    }

    /*-------------------------------------------
                    Getters et Setters
    -------------------------------------------*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
    /*-------------------------------------------
                    méthodes
    -------------------------------------------*/

    public double surface() {
        return this.longueur * this.largeur * this.nbrEtage;
    }
    public void afficherSurface() {
        System.out.println("L'habitation qui se nomme : " +this.getNom() + " à une surface de " + this.surface() + " m²");
    }
}
