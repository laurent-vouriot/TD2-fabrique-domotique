package fr.univamu.iut.exo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

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


    static public void activer(ArrayList<Connectable> objets) {
        for (Connectable c : objets) {
            Demarreur d = new Demarreur();
            String choixUser = new String();
            System.out.println("voulez vous activer " + c + "  (yes/no) ?");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                choixUser = in.readLine();
                if (choixUser.equals("yes")) {
                    System.out.println(" attaché \n");
                    d.attacher(c);
                }
                else if (choixUser.equals("no")) {
                    System.out.println("pas attaché \n");
                }
                else
                    System.out.printf("erreur : yes/no \n");
            } catch (IOException e) {
                e.getMessage();
            }//catch()
            d.demarrerLesActives();


        }
    }//activer()

    public static void main(String[] args) {

        Radio     radio     = new Radio();
        Radiateur radiateur = new Radiateur();
        Cafetiere Cafetiere = new Cafetiere();

        objets.add(radiateur);
        objets.add(radio);
        objets.add(Cafetiere);
        activer(objets);


    }

}
