package fr.univamu.iut.exo1;

/**
 * @class Radio
 */
public class Radio implements Connectable{
    public Radio () {}
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis une radio avec le gadget : " + gadget);
    }
}
