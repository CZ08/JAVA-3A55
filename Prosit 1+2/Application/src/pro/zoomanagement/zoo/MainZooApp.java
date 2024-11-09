package pro.zoomanagement.zoo;

import zoomanage.Animal.Animal;
import zoomanage.Zoo.Zoo;

public class MainZooApp {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "Tunis", 25);
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}
