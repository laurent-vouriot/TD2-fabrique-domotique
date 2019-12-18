package fr.univamu.iut.exo4;

public class Cafetiere implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la cafetiere avec " + gadget);
    }
}
