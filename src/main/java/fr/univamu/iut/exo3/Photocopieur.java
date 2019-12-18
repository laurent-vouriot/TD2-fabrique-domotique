package fr.univamu.iut.exo3;


/**
 * @class photocopieur extends Imprimante
 */
public class Photocopieur extends Decorateur{

    Imprimante imprimanteADecorer;

    public Photocopieur(Imprimante i) {
        imprimanteADecorer = i;
    }//Photocopieur()

    //nouvelle methode
    public void photocopier(String fic) {
        System.out.println("bip bip je photocopie le fichier : " + fic);
    }//photocopuer()

    @Override
    public void imprimer(String s) {
            imprimanteADecorer.imprimer("et je possède photocopieur : ");
    }//imprimer()
}//Photocopieur
