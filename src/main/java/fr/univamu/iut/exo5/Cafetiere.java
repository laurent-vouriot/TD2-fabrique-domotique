package fr.univamu.iut.exo5;


import fr.univamu.iut.exo4.Connectable;

/**
 * @aurhor Laurent
 * classe Cafetière fille de connectable
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
