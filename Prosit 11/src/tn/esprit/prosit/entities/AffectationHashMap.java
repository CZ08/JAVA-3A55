package tn.esprit.prosit.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    protected Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        affectations.put(employe, departement);
        System.out.println("Affectation ajoutée : " + employe + " -> " + departement);
    }

    // Afficher les employés et les départements
    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, departement) ->
                System.out.println("Employé : " + employe + ", Département : " + departement));
    }

    // Supprimer un employé
    public void supprimerEmploye(Employe employe) {
        if (affectations.remove(employe) != null) {
            System.out.println("Employé supprimé : " + employe);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    // Rechercher un employé
    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }

    // Rechercher un département
    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }

    // Trier la map par ID des employés
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations); // Fonctionne maintenant car Employe implémente Comparable
    }
}
