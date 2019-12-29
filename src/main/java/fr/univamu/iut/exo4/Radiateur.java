package fr.univamu.iut.exo4;

/**
 * @aurhor Laurent
 * classe radiateur fille de connectable
 */
public class Radiateur implements Connectable {
    public Radiateur() {}
    @Override
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis un radiateur avec le gadget : " + gadget);
    }//equiper()

    @Override
    public void demarrer() {System.out.println("démarrage du radiateur");}
}
