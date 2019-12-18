package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Connectable;

/**
 * @class Cafetiere
 */
public class Cafetiere implements Connectable {
    private String name;

    public Cafetiere(String name) {
        this.name = name;
    }

    public void equiper(String gadget) {
        System.out.println("bleep blop je suis une cafetière appelée" + name + "avec " + gadget);
    }//equiper()

}//Cafetiere
