package com.cda2.interfaces;

public class Batman extends Personnage implements Competences{
    public Batman(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }

    @Override
    public void attaquer(Personnage objet) {
        if(this.getAttaque()-objet.getDefense() >0) {
            objet.setVie(this.getAttaque()-objet.getDefense());
        }
    }
}
