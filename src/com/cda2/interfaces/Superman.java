package com.cda2.interfaces;

public class Superman extends Personnage implements Competences{
    public Superman(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }

    @Override
    public void attaquer(Personnage objet) {
        if(this.getAttaque()-objet.getDefense() >0) {
            objet.setVie(this.getAttaque()-objet.getDefense()) ;
        }
    }
}
