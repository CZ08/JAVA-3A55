package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class MainZooApp {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("belvidère", "Tunis");
        Animal lion = new Animal("Simba", "Lion", 20, true);
        Animal elephant = new Animal("eleph1", "eleph11", 20, true);
        Animal aaaa = new Animal("a", "aa", 20, true);
        Animal bbbb = new Animal("b", "bb", 20, true);
        Animal ccc = new Animal("cc", "ccc", 20, true);
        Animal dddd = new Animal("d", "dddd", 20, true);

        System.out.println(myZoo);
        System.out.println(lion);

        // Ajout des animaux dans le zoo
        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(aaaa);
            myZoo.addAnimal(bbbb);
            myZoo.addAnimal(ccc);
            myZoo.addAnimal(dddd);
            myZoo.addAnimal(elephant); // Cette ligne doit lever une exception si le zoo est plein
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(new Animal("cc", "ccc", 20, true));
        if (index != -1) {
            System.out.println("L'animal cc est à l'indice : " + index);
        } else {
            System.out.println("L'animal cc n'a pas été trouvé.");
        }

        Dolphin dolphin = new Dolphin("Pacific Ocean", 25.5f);
        Penguin penguin = new Penguin("Antarctica", 100.0f);

        System.out.println(dolphin);
        System.out.println(penguin);

        dolphin.swim();
        penguin.swim();

        try {
            myZoo.addAquaticAnimal(dolphin);
            myZoo.addAquaticAnimal(penguin);
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Affichage des animaux aquatiques qui nagent
        myZoo.displayAquaticAnimalsSwim();

        // Profondeur maximale des pingouins
        System.out.println("Profondeur maximale des pingouins : " + myZoo.maxPenguinSwimmingDepth() + " mètres");

        // Nombre de dauphins et de pingouins
        myZoo.displayNumberOfAquaticsByType();

        // Tests pour les interfaces Carnivore, Herbivore, et Omnivore
        System.out.println("\n--- Tests pour les interfaces ---");

        // Test avec un Aquatic
        Aquatic aquatic = new Penguin("Arctic", 75.0f);
        System.out.println("Testing Carnivore for Aquatic:");
        aquatic.eatMeat(Food.MEAT);
        aquatic.eatMeat(Food.PLANT);

        // Test avec un Terrestrial
        Terrestrial terrestrial = new Terrestrial(4);
        System.out.println("\nTesting Omnivore for Terrestrial:");
        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlant(Food.PLANT);
        terrestrial.eatPlantAndMeat(Food.BOTH);

        // Vérification du comportement d'un pingouin en tant qu'Aquatic
        System.out.println("\nTesting Penguin (inherits from Aquatic):");
        aquatic.swim(); // Appel de la méthode swim
    }
}
