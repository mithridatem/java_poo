package com.cda2.classe;

public class Utilisateur {
    /*-------------------------------------------
                    Attributs
    -------------------------------------------*/
    private String nom;
    private String prenom;
    private String email;
    private String password;

   /*-------------------------------------------
                   Constructeurs
   -------------------------------------------*/
    public Utilisateur(){};

    public Utilisateur(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*-------------------------------------------
                    Méthodes
    -------------------------------------------*/
    public String toString() {
        return this.nom + " " + this.prenom;
    }
}
