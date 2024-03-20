package com.cd2.game;

public class Partie {
    /*-------------------------------------------
                    Attributs
    -------------------------------------------*/
    private Personnage perso1;
    private Personnage perso2;
    private int nbrTour;
    /*-------------------------------------------
                    Constructeur
    -------------------------------------------*/
    public Partie(Personnage perso1, Personnage perso2, int nbrTour) {
        this.perso1 = perso1;
        this.perso2 = perso2;
        this.nbrTour = nbrTour;
    }
    /*-------------------------------------------
                    Méthodes
    -------------------------------------------*/
    public String lancerPartie() {
        while (nbrTour > 0 && this.perso1.getVie() > 0 && this.perso2.getVie() > 0) {
            //lancer attaque du perso1 -> perso2
            this.perso1.attaquer(this.perso2);
            //lancer attaque du perso2 -> perso1
            this.perso2.attaquer(this.perso1);
            //décrémenter le nbrTour
            this.nbrTour--;
        }
        //condition le joueur 1 gagne
        if (this.perso2.getVie() < 0) {
            return this.perso1.getNom();
        }
        if (this.perso1.getVie() < 0) {
            return this.perso2.getNom();
        }
        return "Egalité";
    }
}
