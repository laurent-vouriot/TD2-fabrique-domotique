package fr.univamu.iut.exo1;

/**
 * @author Laurent
 * classe de la cafetière
 * */
public class Cafetiere implements Connectable {
    public Cafetiere() {}
    public void equiper(String gadget) {
        System.out.println("bleep blop je suis une cafetière avec le gadget : " + gadget);
    }//equiper()

}//Cafetiere
