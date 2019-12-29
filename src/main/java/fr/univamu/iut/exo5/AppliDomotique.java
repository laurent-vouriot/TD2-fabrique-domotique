package fr.univamu.iut.exo5;


import fr.univamu.iut.exo5.Connectable;
import java.util.ArrayList;

/**
 * @author Laurent Vouriot
 * TD 2 EXO 5
 */
public class AppliDomotique {

    static ArrayList<Connectable> objets = new ArrayList<Connectable>();



    public static void main(String[] args) {
        Adaptateur adaptateur1 = new Adaptateur(new Fax(new ImprimanteLocale()));
        Adaptateur adaptateur2 = new Adaptateur(new Photocopieur(new Scanner(new ImprimanteReseau())));
        objets.add(adaptateur1);
        objets.add(adaptateur2);

        for(Connectable c : objets) {
            c.equiper("matraque téléscopique");
            c.demarrer();



        }
        System.out.println(objets);
    }





}
