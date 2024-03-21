package com.cda2.interfaces;

public class Flash extends Personnage implements Competences{
    public Flash(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }

    @Override
    public void attaquer(Personnage objet) {
        if(this.getAttaque()-objet.getDefense() >0) {
            objet.setVie(this.getAttaque()-objet.getDefense()) ;
        }
    }
}
