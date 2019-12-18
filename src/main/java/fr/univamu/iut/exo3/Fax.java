package fr.univamu.iut.exo3;

/**
 * @class Fax extends Imprimante
 */
public class Fax extends Decorateur{

    Imprimante imprimanteADecorer;

    public Fax(Imprimante i) {
        imprimanteADecorer = i;
    }//Photocopieur()

    //nouvelle methode
    public void Fax(String fic) {
        System.out.println("bip bip je Fax le fichier : " + fic);
    }//photocopuer()

    @Override
    public void imprimer(String s) {
        imprimanteADecorer.imprimer("et je possède fax " + s);
    }//imprimer()
}//Photocopieur