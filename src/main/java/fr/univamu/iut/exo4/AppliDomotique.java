package fr.univamu.iut.exo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Laurent Vouriot
 * TD 2 EXO 4
 */
public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();
    static Fabrique    fab               = new FabriqueConcrete();
    static Demarreur   demarreur         = new Demarreur();

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
    }//menu()

    public static void connecter(String type) {
        try {
            Connectable c = fab.fabriquer(type);
            objets.add(c);
            System.out.println("Ajout d'un nouvel objet connectable : "  + c.getClass());
        } catch( ClassNotFoundException cnfe) {
            cnfe.getCause();
        }

    }//connecter()

    public static void activer() {
        String choix = new String();
        for (Connectable c : objets) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("voulez vous activer (y/n) " + c);
            try {
                choix = in.readLine();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            switch (choix) {
                case "y":
                        demarreur.attacher(c);
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("erreur de saisie usage : y/n");
                        break;
                }
        }
    }//activer()

    public static void desactiver() {
        String choix = new String();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (Connectable c : objets) {
            System.out.println("voulez vous détacher (y/n) " + c);
            try {
                choix = in.readLine();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            switch(choix) {
                case "y":
                    demarreur.detacher(c);
                    break;
                case "n":
                    break;
                default:
                    System.out.println("erreur de saisie usage : y/n");
                    break;
            }
        }
    }//desactiver()

    public static void main(String[] args) {
        String type = menu();
        while (!(type.isEmpty())) {
            connecter(type);
            type = menu();
        }
        System.out.println(objets);

        activer();
        demarreur.demarrerLesActives();
        desactiver();
        demarreur.demarrerLesActives();
    }//main()
}
