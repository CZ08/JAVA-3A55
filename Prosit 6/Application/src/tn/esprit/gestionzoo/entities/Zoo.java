package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected static final int MAX_CAGES = 25;
    protected Animal[] animals;
    protected String name;
    protected String city;
    protected Aquatic[] aquaticAnimals;
    protected int nbCages = MAX_CAGES;
    protected int animalCount = 0;
    protected int aquaticAnimalCount = 0;

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

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticAnimalCount >= 10) {
            System.out.println("Le tableau des animaux aquatiques est plein.");
            return;
        }
        aquaticAnimals[aquaticAnimalCount] = aquatic;
        aquaticAnimalCount++;
    }

    // Méthode pour afficher tous les animaux aquatiques qui nagent
    public void displayAquaticAnimalsSwim() {
        for (int i = 0; i < aquaticAnimalCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    // Renvoyer la profondeur maximale de vos pingouins
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
}

