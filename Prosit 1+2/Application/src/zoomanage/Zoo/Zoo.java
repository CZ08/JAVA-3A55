package zoomanage.Zoo;
import zoomanage.Animal.Animal;

public class Zoo {
    public Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages];  // Limité à 25 animaux
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages);
    }
    public String toString() {
        return "Zoo: " + name + " (City: " + city + ", Cages: " + nbrCages + ")";
    }
}
