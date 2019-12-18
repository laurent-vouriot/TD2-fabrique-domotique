package fr.univamu.iut.exo2;

public abstract class FabriqueAbstraiteConnectable {

    public abstract Connectable creer(String nomClasse)	throws ClassNotFoundException;

    public abstract void equiper(Connectable c);

    public Connectable fabriquer(String nomClasse)	throws ClassNotFoundException {
        Connectable c = creer(nomClasse);
        equiper(c);
        return c;
    }
}
