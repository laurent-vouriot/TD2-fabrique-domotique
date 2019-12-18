package fr.univamu.iut.exo2;

import fr.univamu.iut.exo1.Connectable;

/**
 * @class Radio
 */
public class Radio implements Connectable{
    private String name;
    public Radio(String name) { this.name = name;}
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis une radio equipé de " + gadget);
    }
}
