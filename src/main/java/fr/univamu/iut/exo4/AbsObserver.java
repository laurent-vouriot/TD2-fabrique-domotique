package fr.univamu.iut.exo4;

import java.util.ArrayList;
import java.util.Collection;


/**
 * @author Laurent Vouriot
 * classe abstraite Observer pour le design pattern de l'observateur
 */
public abstract class AbsObserver {
    //liste d'observateurs
    private Collection<Connectable> ObjetActives = new ArrayList<>();

    public AbsObserver() {}

    //methodes abstraites pour le design pattern
    public abstract void attacher(Connectable c);
    public abstract void detacher(Connectable c);
    //methode equivalente à "notifier"
    public abstract void demarrerLesActives();

    //GETTERS
    public Collection<Connectable> getObjetActives() {
        return ObjetActives;
    }
    //SETTERS
    public void setObjetActives(Collection<Connectable> objetActives) {
        ObjetActives = objetActives;
    }
}
