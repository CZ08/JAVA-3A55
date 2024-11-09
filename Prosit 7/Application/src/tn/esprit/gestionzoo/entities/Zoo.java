package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Zoo {
    protected static final int MAX_CAGES = 3; // Limitation à 3 cages
    protected Animal[] animals; // Tableau pour les animaux terrestres et généraux
    protected Aquatic[] aquaticAnimals; // Tableau pour les animaux aquatiques
    protected String name;
    protected String city;
    protected int animalCount = 0; // Compteur pour les animaux terrestres
    protected int aquaticAnimalCount = 0; // Compteur pour les animaux aquatiques

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
        this.aquaticAnimals = new Aquatic[10]; // Capacité maximale de 10 pour les animaux aquatiques
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    // Ajouter un animal terrestre ou générique
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Un animal ne peut pas avoir un âge négatif : " + animal.getAge());
        }
        if (animalCount >= MAX_CAGES) {
            throw new ZooFullException("Impossible d'ajouter l'animal. Le zoo est plein !");
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal ajouté avec succès : " + animal.getName());
    }

    // Ajouter un animal aquatique
    public void addAquaticAnimal(Aquatic aquatic) throws ZooFullException {
        if (aquaticAnimalCount >= aquaticAnimals.length) {
            throw new ZooFullException("Le tableau des animaux aquatiques est plein.");
        }
        aquaticAnimals[aquaticAnimalCount] = aquatic;
        aquaticAnimalCount++;
        System.out.println("Animal aquatique ajouté avec succès.");
    }

    // Afficher tous les animaux
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour afficher tous les animaux aquatiques nageant
    public void displayAquaticAnimalsSwim() {
        for (int i = 0; i < aquaticAnimalCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Renvoyer la profondeur maximale des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Afficher le nombre de dauphins et de pingouins
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    // Recherche d'un animal terrestre
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
            animalCount--;
            System.out.println("L'animal a été supprimé.");
            return true;
        }
        System.out.println("L'animal n'a pas été trouvé.");
        return false;
    }
}
