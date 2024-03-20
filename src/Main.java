import com.cd2.game.Assassin;
import com.cd2.game.Guerrier;
import com.cd2.game.Partie;
import com.cda2.classe.*;

public class Main {
    public static void main(String[] args) {
        //instancier les objets
        Assassin assassin = new Assassin("Assassin", 200, 10, 5, 10);
        Guerrier guerrier = new Guerrier("Guerrier", 250, 5, 6, 10);
        Partie partie = new Partie(assassin, guerrier, 10);
        System.out.println(partie.lancerPartie());
    }
}
