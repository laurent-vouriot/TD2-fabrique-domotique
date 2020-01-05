package fr.univamu.iut.exo5;

import fr.univamu.iut.exo4.Connectable;

/**
 * @aurhor Laurent
 * classe Radio implemente Connectable
 */

public class Radio implements Connectable {
    public Radio () {}
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis une radio avec le gadget : " + gadget);
    }//equiper()

    @Override
    public void demarrer(){
        System.out.println("démarrage de la radio");
    }//demarrer()
}
