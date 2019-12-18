package fr.univamu.iut.exo2;

public class FabriqueConnectableSony extends FabriqueAbstraiteConnectable {
    @Override
    public Connectable creer(String nomClasse) throws ClassNotFoundException {
        Connectable c = null;
        switch (nomClasse) {
            case "Cafetiere":
                c = new Cafetiere();
                break;
            case "Radio":
                c = new Radio();
                break;
            case "Radiateur":
                c = new Radiateur();
                break;
            default:
                throw new ClassNotFoundException();
        }

        return c;
    }

    @Override
    public void equiper(Connectable c) {
        c.equiper("mon gadget Sony");
    }
}
