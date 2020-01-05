package fr.univamu.iut.exo2;

/**
 * @aurhor Laurent
 * classe radiateur implémente connectable
 */
public class Radiateur implements Connectable{
    @Override
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis un radiateur avec le gadget : " + gadget);
    }//equiper
}
