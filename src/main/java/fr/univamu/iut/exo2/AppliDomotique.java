package fr.univamu.iut.exo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppliDomotique {
    static ArrayList<Connectable> objets = new ArrayList<Connectable>();
    static FabriqueAbstraiteConnectable fab = new FabriqueConnectableSony();

    public static String menu() {
        String nomClasse = new String();
        System.out.println("Taper Entrée pour finir ou le nom de la classe de l'objet à connecter");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            nomClasse = in.readLine();
        } catch (IOException e) {
        }
        return nomClasse;
    }

    public static void connecter(String nomClasse) {
        try {
            Connectable c = fab.fabriquer(nomClasse);
            objets.add(c);
            System.out.println("Ajout d'un nouveau objet de type "
                    + (c.getClass()).getName());
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            System.out.println("Cette classe n'existe pas");
        } catch (ClassCastException e) {
            System.out.println("Cette classe n'est pas connectable");
        }
    }

    public static void main(String[] args) {
        String classeEffective = new String();
        while (!(classeEffective = menu()).isEmpty()) {
            connecter(classeEffective);
        }
        System.out.println(objets);
    }

}
