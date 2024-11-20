package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> employes;

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
        for (Employe employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
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
            System.out.println("Employé non trouvé : " + employe);
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
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
