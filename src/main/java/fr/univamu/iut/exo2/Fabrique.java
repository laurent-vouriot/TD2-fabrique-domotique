package fr.univamu.iut.exo2;




public abstract class Fabrique {
    public Connectable fabriquer(String nom) throws ClassNotFoundException {
        Connectable c = creer(nom);
        equiper(c);
        return c;
    }

    public abstract Connectable creer(String s);
    public abstract void equiper(Connectable c);

}//Fabrique
