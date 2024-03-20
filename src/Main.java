import com.cda2.classe.*;

public class Main {
    public static void main(String[] args) {
        //instance d'objet Animal
        Animal poule = new Animal("poule", 30, 1);

        //instance d'objet Chat
        Chat matou = new Chat("matou", 40, 4, 8);
        poule.dormir();
        matou.dormir();
        matou.dormirParent();
        matou.dormir(10);
    }
}
