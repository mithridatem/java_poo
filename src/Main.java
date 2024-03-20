import com.cda2.classe.*;

public class Main {
    public static void main(String[] args) {
        //instance d'objet Vehicule
        Vehicule moto = new Vehicule("Moto", 2, 280);
        Vehicule voiture = new Vehicule("Voiture", 4, 200);
        Vehicule camion = new Vehicule("Camion", 6, 130 );
        //appel de la méthode detect
        System.out.println("Le véhicule " + moto.getNom() + " est de type : " + moto.detect());
        System.out.println("Le véhicule " + voiture.getNom() + " est de type : " + voiture.detect());
        System.out.println("Le véhicule " + camion.getNom() + " est de type : " + camion.detect());

        System.out.println("Le véhicule : " + moto.getNom() + " a une nouvelle vitesse de : " + moto.getVitesse());
        moto.boost();
        System.out.println("Le véhicule : " + moto.getNom() + " a une nouvelle vitesse de : " + moto.getVitesse());

    }
}
