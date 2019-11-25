package fr.univamu.iut.exo1;

/**
 * @class Cafetiere
 */
public class Cafetiere implements Connectable {
    private String name;
    public Cafetiere(String name) {
        this.name = name;
    }//Cafetiere()
    public void equiper(String gadget) {
        System.out.println("bleep blop je suis une cafetière avec " + gadget);
    }//equiper()

}//Cafetiere
