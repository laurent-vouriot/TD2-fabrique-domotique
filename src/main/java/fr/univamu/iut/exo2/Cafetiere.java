package fr.univamu.iut.exo2;


/**
 * @aurhor Laurent
 * classe Cafetière fille de connectable
 */

public class Cafetiere implements Connectable {
    public Cafetiere() {}
    public void equiper(String gadget) {
        System.out.println("bleep blop je suis une cafetière avec le gadget : " + gadget);
    }//equiper()

}//Cafetiere
