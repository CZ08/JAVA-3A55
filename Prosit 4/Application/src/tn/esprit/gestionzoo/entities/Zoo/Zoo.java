package tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal.Animal;

public class Zoo {
    private static final int MAX_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int nbCages = MAX_CAGES;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
    }

    public String getName() {
        return name;
    }

    // Setter sécurisé pour name
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbCages=" + nbCages +
                '}';
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter d'autres animaux.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal est déjà présent dans le zoo.");
            return false;
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++;
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            animalCount--;
            System.out.println("L'animal a été supprimé.");
            return true;
        }
        System.out.println("L'animal n'a pas été trouvé.");
        return false;
    }

    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Animaux dans le zoo : ");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(i + ": " + animals[i].getName());
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animalCount == nbCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }
}

