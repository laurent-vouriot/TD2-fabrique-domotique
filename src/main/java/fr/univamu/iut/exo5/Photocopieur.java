package fr.univamu.iut.exo5;

/**
 * @author Laurent
 * classe photocopieur implemente Photocopieur
 */
public class Photocopieur implements Decorateur {

    Imprimante imprimanteADecorer;

    public Photocopieur(Imprimante imprimante) { imprimanteADecorer = imprimante;}

    @Override
    public void imprimer() {
        imprimanteADecorer.imprimer();
        System.out.println("la fonction Photocopieur activée");
    }//imprimer()
}
