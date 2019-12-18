package fr.univamu.iut.exo3;

/**
 * @class Fax extends Imprimante
 */
public class Scanner extends Decorateur{

    Imprimante imprimanteADecorer;

    public Scanner(Imprimante i) {
        imprimanteADecorer = i;
    }//Photocopieur()

    //nouvelle methode
    public void  Scanner(String fic) {
        System.out.println("bip bip je Scanne le fichier : " + fic);
    }//Scanner()

    @Override
    public void imprimer(String s) {
        imprimanteADecorer.imprimer(" et je possède scanner : " + s);
    }//imprimer()
}//Scanner