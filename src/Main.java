import com.cda2.interfaces.*;
public class Main {
    public static void main(String[] args) {
        Batman batman = new Batman("Batman", 20, 10, 5);
        Superman superman = new Superman("Superman", 30,10, 10);
        Flash flash = new Flash("Flash", 15, 15, 5);
        System.out.println(superman.getVie());
        batman.attaquer(superman);
        System.out.println(superman.getVie());
        System.out.println(flash.getVie());
        superman.attaquer(flash);
        System.out.println(flash.getVie());
        System.out.println(batman.getVie());
        flash.attaquer(batman);
        System.out.println(batman.getVie());
    }
}
