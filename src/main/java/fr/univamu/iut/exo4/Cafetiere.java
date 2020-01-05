package fr.univamu.iut.exo4;


/**
 * @aurhor Laurent
 * classe Cafetière implemente de connectable
 */

public class Cafetiere implements Connectable {
    public Cafetiere() {}
    public void equiper(String gadget) {
        System.out.println("bleep blop je suis une cafetière avec le gadget : " + gadget);
    }//equiper()

    @Override
    public void demarrer() {
        System.out.println("démarrage de la cafetière");
    }//demarrer()

}//Cafetiere
