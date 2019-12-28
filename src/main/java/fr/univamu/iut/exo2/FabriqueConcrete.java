package fr.univamu.iut.exo2;


/**
 * @author Laurent
 * Fabrique concrète
 */
public class FabriqueConcrete extends Fabrique {

    @Override
    public Connectable creer(String classe) throws ClassNotFoundException{
        Connectable c = null;
        switch (classe) {
            case "Cafetière":
                c = new Cafetiere();
                break;
            case "Radio":
                c = new Radio();
                break;
            case "Radiateur":
                c = new Radiateur();
                break;
        }
        return c;
    }

    @Override
    public void equiper(Connectable c) {
        c.equiper("antenne parabolique");
    }
}
