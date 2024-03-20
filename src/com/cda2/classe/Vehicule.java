package com.cda2.classe;

public class Vehicule {
    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule(){}
    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void boost() {
        this.vitesse += 50;
    }

    public String detectv2() {
        String type = "";
        if(this.nbrRoue == 2) {
            type = "Moto";
        }
        else if(this.nbrRoue == 4){
            type = "Voiture";
        }
        else{
            type = "Autre";
        }
        return type;
    }

    public String detect() {
        if(this.nbrRoue == 2) {
            return "Moto";
        }
        if (this.nbrRoue == 4) {
            return "Voiture";
        }
        return "Autre";
    }

    public String plusRapide(Vehicule vehicule) {
        if(this.vitesse > vehicule.vitesse) {
            return this.getNom();
        }
        if(vehicule.vitesse > this.vitesse) {
            return vehicule.getNom();
        }
        return "Les 2 véhicules vont à la même vitesse";
    }
}
