package fr.univamu.iut.exo5;

/**
 * @author Laurent
 * imprimante locale, est une sorte d'imprimante
 */
public class ImprimanteLocale implements Imprimante {

    public ImprimanteLocale() {}

    @Override
    public void imprimer() {
        System.out.println("je suis une imprimante locale");
    }//imprimer()
}//ImprimanteLocal
