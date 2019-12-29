package fr.univamu.iut.exo3;

/**
 * @author Laurent
 * classe fax qui est un decorateur
 */
public class Fax  implements Decorateur {

    Imprimante imprimanteADecorer;

    public Fax(Imprimante imprimante) { imprimanteADecorer = imprimante;}


    @Override
    public void imprimer() {
        imprimanteADecorer.imprimer();
        System.out.println("la fonction Fax activée");
    }
}//Fax
