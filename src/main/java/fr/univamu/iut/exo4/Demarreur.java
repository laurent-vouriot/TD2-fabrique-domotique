package fr.univamu.iut.exo4;


import java.util.ArrayList;

public class Demarreur {

    private ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public Demarreur() {}

    public void demarrerLesActives() {
        for(Connectable c : objets) {
            c.demarrer();
        }
    }//demarrerLesActives()

    public void attacher(Connectable c) {
        objets.add(c);
    }//attacher()

    public void detacher(Connectable c){
        objets.add(c);
    }//detacher()
}