package fr.univamu.iut.exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Laurent Vouriot
 * TD 2 EXO 2 design pattern de la fabrique
 */
public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();
    static Fabrique fab = new FabriqueConcrete();

    public static String menu() {
        String choix = new String();
        System.out.println("Taper Entrée pour finir, ou le nom de l'objet à créer");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = in.readLine();
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void connecter(String type) {
        try {
            Connectable c = fab.fabriquer(type);
            objets.add(c);
            System.out.println("Ajout d'un nouvel objet connectable : "  + c.getClass());
        } catch( ClassNotFoundException cnfe) {
            cnfe.getCause();
        }

    }

    public static void main(String[] args) {
        String type = menu();
        while (!(type.isEmpty())) {
            connecter(type);
            type = menu();
        }
        System.out.println(objets);
    }
}
