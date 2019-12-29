package fr.univamu.iut.exo3;

/**
 * @author laurent
 * classe scanner est une sorte d'imprimante
 */
public class Scanner implements Decorateur {

   Imprimante imprimanteADecorer;

    public Scanner(Imprimante imprimante) { imprimanteADecorer = imprimante;}

    @Override
    public void imprimer() {
        imprimanteADecorer.imprimer();
        System.out.println("la fonction Scanner est activée" );
    }//imprimer()


}
