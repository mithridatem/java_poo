package com.cda2.classe;

public class Chat extends Animal implements Comportement{
    private int age;
    public Chat(String nom, int taille, int poids, int age){
        super(nom,taille,poids);
        this.age = age;
    }
    public void dormir(){
        System.out.println(super.getNom() + " dors");
    }

    public String toString(){
        return super.getNom();
    }

    public void dormirParent() {
        super.dormir();
    }
    public void dormir(int duree) {
        System.out.println(super.getNom() + " dors pendant " + duree);
    }

    @Override
    public void marcher() {
        System.out.println("Le chat marche");
    }

    @Override
    public void stopper() {
        System.out.println("Le chat s'est arrêté");
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange");
    }
}
