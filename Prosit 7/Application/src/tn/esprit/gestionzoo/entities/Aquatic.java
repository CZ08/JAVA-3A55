package tn.esprit.gestionzoo.entities;

public abstract class Aquatic {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    // Méthode abstraite pour obliger les classes filles à redéfinir swim
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return habitat.equals(aquatic.habitat);
    }

    @Override
    public String toString() {
        return "Aquatic [habitat=" + habitat + "]";
    }
}
