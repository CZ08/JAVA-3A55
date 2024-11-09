package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;


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
        myZoo.addAnimal(lion);
        myZoo.addAnimal(aaaa);
        myZoo.addAnimal(bbbb);
        myZoo.addAnimal(ccc);
        myZoo.addAnimal(dddd);

        boolean ajoutReussi = myZoo.addAnimal(elephant);
        if (!ajoutReussi) {
            System.out.println("Impossible d'ajouter plus d'animaux.");
        }

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(new Animal("cc", "ccc", 20, true));
        if (index != -1) {
            System.out.println("L'animal cc est à l'indice : " + index);
        } else {
            System.out.println("L'animal cc n'a pas été trouvé.");
        }

        Aquatic aquatic = new Aquatic("Ocean");
        Dolphin dolphin = new Dolphin("Pacific Ocean", 25.5f);
        Penguin penguin = new Penguin("Antarctica", 100.0f);

        System.out.println(aquatic);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

    }
}


