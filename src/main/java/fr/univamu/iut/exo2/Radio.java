package fr.univamu.iut.exo2;

/**
 * @aurhor Laurent
 * classe Radio, fille de connectable
 */

public class Radio implements Connectable {
    public Radio () {}
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis une radio avec le gadget : " + gadget);
    }
}
