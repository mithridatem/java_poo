package com.cd2.game;

public class Guerrier extends Personnage {
    /*-------------------------------------------
                    Attributs
    -------------------------------------------*/
    private int bonusDefense;
    /*-------------------------------------------
                    Constructeurs
    -------------------------------------------*/
    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }
    /*-------------------------------------------
                    Getters et Setters
    -------------------------------------------*/

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
    /*-------------------------------------------
                    Méthodes
    -------------------------------------------*/
    public void attaquer(Personnage personnage) {
        //cas ou on déclenche une defense Critique
        if((Math.random() * 100) > 94.99) {
            this.setVie(this.getVie() + this.bonusDefense);
        }
        //cas ou on ne déclenche pas une défense critique
        super.attaquer(personnage);
    }
}
