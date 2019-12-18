package fr.univamu.iut.exo4;

public class Radio implements Connectable {
    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la radio avec " + gadget);
    }
}
