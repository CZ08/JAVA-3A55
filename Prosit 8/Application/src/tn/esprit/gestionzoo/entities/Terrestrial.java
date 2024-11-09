package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial implements Omnivore<Food> {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    // Implémentation de la méthode eatMeat
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("This terrestrial animal is eating meat.");
        } else {
            System.out.println("This terrestrial animal only eats meat.");
        }
    }

    // Implémentation de la méthode eatPlant
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("This terrestrial animal is eating plants.");
        } else {
            System.out.println("This terrestrial animal only eats plants.");
        }
    }

    // Implémentation de la méthode eatPlantAndMeat
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("This terrestrial animal is eating both plants and meat.");
        } else {
            System.out.println("This terrestrial animal requires both plants and meat.");
        }
    }

    @Override
    public String toString() {
        return "Terrestrial [nbrLegs=" + nbrLegs + "]";
    }
}
