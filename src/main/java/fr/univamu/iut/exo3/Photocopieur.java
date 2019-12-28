package fr.univamu.iut.exo3;

/**
 * @author Laurent
 * classe photocopieur implemente Photocopieur
 */
public class Photocopieur implements Imprimante{

    Imprimante imprimanteADecorer;

    public Photocopieur(Imprimante imprimante) { imprimanteADecorer = imprimante;}

    @Override
    public void imprimer() {
        imprimanteADecorer.imprimer();
        System.out.println("la fonction Photocopieur activée");
    }//imprimer()
}
