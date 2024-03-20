package com.cd2.game;

public class Assassin extends Personnage {
    /*-------------------------------------------
                    Attributs
    -------------------------------------------*/
    private int bonusAttaque;
    /*-------------------------------------------
                    Constructeur
    -------------------------------------------*/
    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }
    /*-------------------------------------------
                    Getters et Setters
    -------------------------------------------*/

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    /*-------------------------------------------
                        Méthodes
        -------------------------------------------*/
    public void attaquer(Personnage personnage) {
        //cas ou on déclenche une attaque critique
        if((Math.random() * 100 ) > 94.99) {
            //si les dégats sont supérieur à 0
            if((this.getAttaque() + this.bonusAttaque - personnage.getDefense()) > 0){
                personnage.setVie(personnage.getVie() - (this.getAttaque() + this.bonusAttaque - personnage.getDefense()));
            }
        }
        //cas ou on ne ne déclanche pas l'attaque critique
        else{
            super.attaquer(personnage);
        }
    }
}
