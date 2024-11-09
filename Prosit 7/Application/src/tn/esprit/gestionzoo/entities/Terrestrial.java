package tn.esprit.gestionzoo.entities;

public class Terrestrial {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial [nbrLegs=" + nbrLegs + "]";
    }
}

