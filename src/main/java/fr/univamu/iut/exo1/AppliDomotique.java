package fr.univamu.iut.exo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * TD 2 EXO 1
 * @author Laurent Vouriot
 *
 */
public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static int menu() {
        int choix = 1;
        System.out.println("Taper 0 pour finir, 1 pour connecter une cafetière et 2 pour une radio");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void connecter(int type) {
        switch (type) {
            case 2:
                Cafetiere cafetiere1= new Cafetiere();
                cafetiere1.equiper("drone de surveillance");
                objets.add(cafetiere1);
                System.out.println("radio ajoutée");
                break;
            case 1:
                Radio radio0 = new Radio();
                radio0.equiper("antenne parabolique");
                objets.add(radio0);
                System.out.println("radio ajoutée");
                break;

            default:
                System.out.println("erreur");
                break;

        }
    }

    public static void main(String[] args) {
        int type = 0;
        while ((type = menu()) != 0) {
            connecter(type);
        }
        System.out.println(objets);
    }
}

/**
 * Question 2 On est obligé de modifier le code à chaque fois que l'on fait un ajout, de même pour equiper(), on doit modifier la classe cliente.
 *
 */


