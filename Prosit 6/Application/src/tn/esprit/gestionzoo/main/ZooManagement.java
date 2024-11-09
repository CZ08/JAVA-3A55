package tn.esprit.gestionzoo.main;

import java.util.Scanner;

public class ZooManagement {

    private int nbrCages = 20;
    private String zooName = "my zoomanagement.zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        zoo.displayZooInfo();

        zoo.getUserInput();
    }

    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoomanagement.zoo : ");
        zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide.");
            scanner.next();
        }
        nbrCages = scanner.nextInt();

        displayZooInfo();

        scanner.close();
    }
}