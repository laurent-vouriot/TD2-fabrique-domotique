package fr.univamu.iut.exo4;

/**
 * @author Laurent
 * interface Connectable, correspond à l'observateur du design pattern Observateur
 */
public interface Connectable {
     void equiper(String gadget);
     //methode abstraite equivalente à update pour le design pattern
     void demarrer();
}
