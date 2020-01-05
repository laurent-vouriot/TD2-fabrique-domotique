package fr.univamu.iut.exo5;


/**
 * @author Laurent Vouriot
 * classe Adaptateur, design pattern adaptateur, adapte les imprimantes en connectables
 */
public class Adaptateur implements Connectable {

    Imprimante imprimanteAAdapter;

    public Adaptateur(Imprimante imprimante) {
            imprimanteAAdapter = imprimante;
    }

    public void imprimer() {
        imprimanteAAdapter.imprimer();
    }

    @Override
    public void equiper(String gadget) {
        System.out.println("je suis une imprimante équipée du gadget : " + gadget );
    }
    @Override
    public void demarrer() {
        System.out.println("je démarre l'imprimante");
    }
}
