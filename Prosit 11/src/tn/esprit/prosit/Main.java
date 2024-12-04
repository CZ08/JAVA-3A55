package tn.esprit.prosit;

import tn.esprit.prosit.entities.Employe;
import tn.esprit.prosit.entities.SocieteArrayList;
import tn.esprit.prosit.entities.Departement;
import tn.esprit.prosit.entities.DepartementHashSet;
import tn.esprit.prosit.entities.AffectationHashMap;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Création de l'objet DepartementHashSet
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création des départements
        Departement it = new Departement(1, "IT", 10);
        Departement finance = new Departement(2, "Finance", 5);
        Departement rh = new Departement(3, "RH", 7);

        // Ajout des départements
        gestionDepartements.ajouterDepartement(it);
        gestionDepartements.ajouterDepartement(finance);
        gestionDepartements.ajouterDepartement(rh);

        // Affichage des départements
        System.out.println("\n--- Liste des départements ---");
        gestionDepartements.displayDepartement();

        // Recherche par nom
        System.out.println("\n--- Recherche par nom ---");
        String nomRecherche = "IT";
        boolean existeNom = gestionDepartements.rechercherDepartement(nomRecherche);
        System.out.println("Le département '" + nomRecherche + "' existe : " + existeNom);

        // Recherche par objet
        System.out.println("\n--- Recherche par objet ---");
        boolean existeObjet = gestionDepartements.rechercherDepartement(finance);
        System.out.println("Le département 'Finance' existe : " + existeObjet);

        // Suppression d'un département
        System.out.println("\n--- Suppression d'un département ---");
        gestionDepartements.supprimerDepartement(it);
        gestionDepartements.displayDepartement();

        // Tri des départements par ID
        System.out.println("\n--- Tri des départements par ID ---");
        TreeSet<Departement> departementsTries = gestionDepartements.trierDepartementById();
        departementsTries.forEach(System.out::println);

        AffectationHashMap affectations = new AffectationHashMap();

        // Création des employés
        Employe emp1 = new Employe(1, "Ali", "Ben Ahmed", "IT", 3);
        Employe emp2 = new Employe(2, "Sana", "Trabelsi", "Finance", 4);

        // Ajouter des employés aux départements
        affectations.ajouterEmployeDepartement(emp1, finance);
        affectations.ajouterEmployeDepartement(emp2, rh);

        // Afficher les affectations
        System.out.println("\n--- Affectations des employés aux départements ---");
        affectations.afficherEmployesEtDepartements();

        // Supprimer un employé
        System.out.println("\n--- Suppression d'un employé ---");
        affectations.supprimerEmploye(emp1);
        affectations.afficherEmployesEtDepartements();

        // Rechercher un employé et un département
        System.out.println("\n--- Recherche d'un employé et d'un département ---");
        System.out.println("Employé 'Sana' existe : " + affectations.rechercherEmploye(emp2));
        System.out.println("Département 'RH' existe : " + affectations.rechercherDepartement(rh));

        // Trier la map des affectations
        System.out.println("\n--- Tri des affectations par ID des employés ---");
        affectations.trierMap().forEach((key, value) ->
                System.out.println("Employé : " + key + " -> Département : " + value));
    }
}
