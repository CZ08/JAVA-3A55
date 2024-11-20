package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    // Méthode abstraite pour obliger les classes filles à redéfinir swim
    public abstract void swim();

    // Implémentation de la méthode eatMeat de Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("This aquatic animal is eating meat.");
        } else {
            System.out.println("This aquatic animal only eats meat.");
        }
    }

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
