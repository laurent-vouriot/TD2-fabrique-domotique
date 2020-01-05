package fr.univamu.iut.exo1;

/**
 * @author Laurent Vouriot
 * classe radion, est une réalisation d'interface de Connectable
 * */
public class Radio implements Connectable{
    public Radio () {}
    public void equiper(String gadget) {
        System.out.println("bleep bloop je suis une radio avec le gadget : " + gadget);
    }
}
