package fr.univamu.iut.exo3;

/**
 * @author Laurent
 * imprimante locale, implemente Imprimante
 */
public class ImprimanteLocale implements Imprimante{

    public ImprimanteLocale() {}

    @Override
    public void imprimer() {
        System.out.println("je suis une imprimante locale");
    }//imprimer()
}//ImprimanteLocal
