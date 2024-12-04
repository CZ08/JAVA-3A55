package tn.esprit.prosit.entities;

import tn.esprit.prosit.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    protected ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
        System.out.println("Employé ajouté : " + employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (employes.remove(employe)) {
            System.out.println("Employé supprimé : " + employe);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        employes.sort(Comparator.comparingInt(Employe::getId));
        System.out.println("Employés triés par ID.");
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println("Employés triés par nom, département et grade.");
    }
}
