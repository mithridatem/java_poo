import com.cda2.classe.*;

public class Main {
    public static void main(String[] args) {
        //instance d'objet Habitation
        Habitation villa = new Habitation("Villa", 12, 15);
        Habitation appartement = new Habitation("Appartement", 8, 14);
        Habitation maison = new Habitation("Maison", 20, 18);
        //appel de la méthode surface
        System.out.println("L'habitation qui se nomme : " + villa.getNom() + " à une surface de " + villa.surface() + " m²");
        System.out.println("L'habitation qui se nomme : " + appartement.getNom() + " à une surface de " + appartement.surface() + " m²");
        System.out.println("L'habitation qui se nomme : " + maison.getNom() + " à une surface de " + maison.surface() + " m²");
    }
}
