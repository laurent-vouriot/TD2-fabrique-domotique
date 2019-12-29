package fr.univamu.iut.exo4;

/**
 * @author Laurent
 * fabrique Abstraite
 */
public abstract class Fabrique {

    public abstract Connectable creer(String classe) throws ClassNotFoundException;
    public abstract void equiper(Connectable c);

    public Connectable fabriquer(String classe)	throws ClassNotFoundException {
        Connectable c = creer(classe);
        equiper(c);
        return c;
    }
}
