package fr.univamu.iut.exo3;

/**
 * @author Laurent
 * Imprimante réseau est une sorte d'imprimante
 */
public class ImprimanteReseau implements Imprimante {

    public ImprimanteReseau() {}

    @Override
    public void imprimer() {
        System.out.println("je suis une imprimante réseau");
    }//Imprimer()
}//ImprimanteReseau
