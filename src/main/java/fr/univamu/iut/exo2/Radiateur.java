package fr.univamu.iut.exo2;

import fr.univamu.iut.exo2.Connectable;

/**
 * @class Radiateur
 */
public class Radiateur implements Connectable {
    private String name;

    public Radiateur(String name) {
        this.name = name;
    }

    public void equiper(String gadget) {
        System.out.println("bleep blop je suis un Radiateur appelée" + name + "avec " + gadget);
    }//equiper()

}//Cafetiere
