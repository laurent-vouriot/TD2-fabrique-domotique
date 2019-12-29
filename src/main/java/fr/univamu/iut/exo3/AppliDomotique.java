package fr.univamu.iut.exo3;

/**
 * @author laurent
 * EXO 3 TD2
 */
public class AppliDomotique {
      public static void main(String[] args){
            Imprimante impLocale = new ImprimanteLocale();
            Imprimante impReseau = new ImprimanteReseau();

            impLocale.imprimer();
            impReseau.imprimer();

            Imprimante impLocaleSanner = new Scanner(impLocale);
            Imprimante impReseauFax    = new Fax(impReseau);

            impLocaleSanner.imprimer();
            impReseauFax.imprimer();

            Imprimante impLocaleScannerPhotocopieur = new Photocopieur(impLocaleSanner);
            Imprimante impReseuFaxScanner           = new Scanner(impReseauFax);

            impLocaleScannerPhotocopieur.imprimer();
            impReseuFaxScanner.imprimer();


      }//main()
}//AppliDomotique