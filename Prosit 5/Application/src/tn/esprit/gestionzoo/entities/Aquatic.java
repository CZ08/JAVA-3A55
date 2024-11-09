package tn.esprit.gestionzoo.entities;

public class Aquatic {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + "]";
    }
}
