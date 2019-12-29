package fr.univamu.iut.exo4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Laurent Vouriot
 * classe démarreur pour démarrer les connectables, design pattern Observer, correspond au sujet
 */
public class Demarreur  extends AbsObserver {

    public Demarreur() {}

    //private Collection<Connectable> ObjetActives = new ArrayList<>();

    @Override
    public void demarrerLesActives() {

        for(Connectable c : getObjetActives()) {
            c.demarrer();
        }
    }//demarrerLesActives()
    @Override
    public void attacher(Connectable c) {
        getObjetActives().add(c);
        System.out.println(c + " attaché !");
    }
    @Override
    public void detacher(Connectable c) {
        getObjetActives().remove(c);
        System.out.println(c + " détaché !");
    }

}//Demarreur
