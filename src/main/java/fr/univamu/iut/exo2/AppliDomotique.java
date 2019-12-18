package fr.univamu.iut.exo2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

/**
 * exo 2 question 1, la solution à notre problème semble être le design pattern factory


public class AppliDomotique {

    static private ArrayList<Connectable> objets = new ArrayList<>();
    //static private Fabrique fab                  = new Fabrique();

    public static void main(String[] args) {}
    public String menu() {
        String nomClasse;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            nomClasse = in.readLine();
            return nomClasse;
        } catch (IOException ioe) {}
        System.out.println("fin");
        return new String ("");
    }//menu()

    public static void connecter(String nomClasse) {
        try {
          //  Connectable c = fab.fabriquer(nomClasse);
            objets.add(c); // liste d'objets connectables
        } catch(ClassNotFoundException CNFE) {
            CNFE.getMessage();
        }catch(ClassNotFound CNF) {
            CNF.getMessage();
        }//catch()
    }//connecter()
}
*/