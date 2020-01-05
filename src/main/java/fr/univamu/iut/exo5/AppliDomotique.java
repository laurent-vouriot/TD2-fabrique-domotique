package fr.univamu.iut.exo5;
import java.util.ArrayList;

/**
 * @author Laurent Vouriot
 * TD 2 EXO 5 Design pattern adaptateur
 */
public class AppliDomotique {

    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static void main(String[] args) {
        Adaptateur adaptateur1 = new Adaptateur(new Fax(new ImprimanteLocale()));
        Adaptateur adaptateur2 = new Adaptateur(new Photocopieur(new Scanner(new ImprimanteReseau())));
        objets.add(adaptateur1);
        objets.add(adaptateur2);

        adaptateur1.imprimer();
        adaptateur2.imprimer();

        for(Connectable c : objets) {
            c.equiper("matraque téléscopique");
            c.demarrer();
        }
        System.out.println(objets);
    }
}
