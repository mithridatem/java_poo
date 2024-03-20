package com.cda2.classe;

public class Chien extends Animal implements Comportement{
    public Chien(String nom, int taille, int poids){
        super(nom, taille, poids);
    }
    @Override
    public void marcher() {
        System.out.println("Le chien se déplace");
    }

    @Override
    public void stopper() {
        System.out.println("Le chien s'est arrêté");
    }

    @Override
    public void manger() {
        System.out.println("Le chien mange");
    }
}
