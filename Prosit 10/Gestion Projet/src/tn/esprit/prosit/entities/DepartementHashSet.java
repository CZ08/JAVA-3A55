package tn.esprit.prosit.entities;

import tn.esprit.prosit.interfaces.IDepartement;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    protected HashSet<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
        System.out.println("Département ajouté : " + departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return departements.stream().anyMatch(d -> d.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        if (departements.remove(departement)) {
            System.out.println("Département supprimé : " + departement);
        } else {
            System.out.println("Département non trouvé.");
        }
    }

    @Override
    public void displayDepartement() {
        System.out.println("Liste des départements :");
        departements.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
