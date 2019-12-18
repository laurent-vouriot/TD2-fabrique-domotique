package fr.univamu.iut.exo3;



public class AppliDomotique {
    public static void main(String[] args) {

        Imprimante impR = new ImprimanteReseau();
        impR.imprimer("bonjour tout le monde");

        Imprimante impL = new ImprimanteLocal();
        impL.imprimer("bonjour tout le monde");

        Decorateur impLScanner = new Scanner(impL);
        impLScanner.imprimer("scanner local");
        Decorateur impRScanner = new Scanner(impR);
        impRScanner.imprimer("scanner reseau");

        Decorateur impRFaxScanner = new Fax(impRScanner);
        impRFaxScanner.imprimer("FaxScanner");
    }//main()
}
