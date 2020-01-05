package fr.univamu.iut.exo4;



/**
 * @author Laurent Vouriot
 * classe démarreur pour démarrer les connectables, design pattern Observer, correspond au sujet
 */
public class Demarreur  extends AbsObserver {

    public Demarreur() {}

    @Override
    public void demarrerLesActives() {

        for(Connectable c : getObjetActives()) {
            c.demarrer();
        }
    }//demarrerLesActives()
    @Override
    public void attacher(Connectable c) {
        getObjetActives().add(c);
        System.out.println(c + " attaché !");
    }
    @Override
    public void detacher(Connectable c) {
        getObjetActives().remove(c);
        System.out.println(c + " détaché !");
    }

}//Demarreur
