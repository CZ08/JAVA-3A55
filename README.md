Ce dépôt regroupe les 12 Prosits réalisés dans le cadre d'une formation en **Java**. Chaque Prosit introduit des concepts clés de programmation orientée objet, de gestion des collections, d'exceptions, et d'utilisation des API Java comme les interfaces fonctionnelles et les flux (streams).

## Structure du Projet

Le projet est organisé en plusieurs modules correspondant aux Prosits, chacun introduisant de nouveaux concepts ou fonctionnalités.

### Table des Prosits

| Prosit  | Sujet                                                                                   | Concepts principaux                                                                                                                                                                                                                       |
|---------|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **1-3** | [Introduction à la programmation Java](#prosit-1-3-introduction-à-la-programmation-java) | Variables, types primitifs, boucles, conditions, tableaux                                                                                                                                                                                |
| **4**   | [Programmation orientée objet](#prosit-4-programmation-orientée-objet)                  | Classes, objets, encapsulation, héritage, polymorphisme                                                                                                                                                                                  |
| **5**   | [Interfaces et abstraction](#prosit-5-interfaces-et-abstraction)                        | Interfaces, classes abstraites, redéfinition de méthodes                                                                                                                                                                                 |
| **6**   | [Exceptions personnalisées](#prosit-6-exceptions-personnalisées)                        | Création et gestion des exceptions, utilisation de `try-catch`                                                                                                                                                                           |
| **7**   | [Collections en Java](#prosit-7-collections-en-java)                                    | Listes (`ArrayList`), ensembles (`HashSet`), cartes (`HashMap`), tri avec `Comparator` et `Comparable`                                                                                                                                   |
| **8**   | [Interfaces fonctionnelles et Lambda](#prosit-8-interfaces-fonctionnelles-et-lambda)    | Interfaces fonctionnelles (`Predicate`, `Consumer`, `Function`, `Supplier`), expressions Lambda                                                                                                                                          |
| **9**   | [Gestion des employés](#prosit-9-gestion-des-employés)                                  | Gestion des employés avec `ArrayList`, tri par ID ou par attributs multiples                                                                                                                                                             |
| **10**  | [Gestion des départements](#prosit-10-gestion-des-départements)                        | Gestion des départements avec `HashSet`, tri avec `TreeSet`                                                                                                                                                                              |
| **11**  | [Affectation des employés aux départements](#prosit-11-affectation-des-employés-aux-départements) | Gestion des relations employé-département avec `HashMap`, suppression et tri des affectations                                                                                                                                             |
| **12**  | [Gestion des étudiants et Stream API](#prosit-12-gestion-des-étudiants-et-stream-api)  | Gestion des étudiants, tri et filtrage avec `Stream`, expressions Lambda avancées                                                                                                                                                        |

---

## Détails des Prosits

### Prosit 1-3 : Introduction à la programmation Java
- Concepts de base : types primitifs, boucles, conditions.
- Implémentation des algorithmes simples.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%201%2B2/Application
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%203

---

### Prosit 4 : Programmation orientée objet
- Création de classes, encapsulation, héritage et polymorphisme.
- Mise en pratique avec des classes représentant des animaux et un zoo.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%204

---

### Prosit 5 : Interfaces et abstraction
- Utilisation des interfaces (`Carnivore`, `Herbivore`, `Omnivore`).
- Création de classes abstraites pour des animaux terrestres et aquatiques.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%205

---

### Prosit 6 : Exceptions personnalisées
- Création d'exceptions comme `ZooFullException` et `InvalidAgeException`.
- Gestion des erreurs avec des blocs `try-catch`.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%206

---

### Prosit 7 : Collections en Java
- Gestion des animaux et zoo avec des collections comme `ArrayList` et `HashSet`.
- Implémentation de méthodes pour le tri avec `Comparator` et `Comparable`.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%207

---

### Prosit 8 : Interfaces fonctionnelles et Lambda
- Introduction aux interfaces fonctionnelles (`Predicate`, `Consumer`, `Supplier`).
- Utilisation des expressions Lambda pour simplifier le code.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%208

---

### Prosit 9 : Gestion des employés
- Gestion des employés avec une liste (`ArrayList`).
- Tri des employés par ID et par attributs multiples (nom, département, grade).
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%209

---

### Prosit 10 : Gestion des départements
- Gestion des départements avec un `HashSet` et tri avec un `TreeSet`.
- Ajout, suppression, recherche et tri des départements.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%2010

---

### Prosit 11 : Affectation des employés aux départements
- Gestion des relations entre employés et départements avec une `HashMap`.
- Recherche, suppression et tri des affectations.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%2011

---

### Prosit 12 : Gestion des étudiants et Stream API
- Utilisation de la `Stream API` pour gérer des étudiants :
  - Filtrage avec `Predicate`.
  - Affichage avec `Consumer`.
  - Tri avec des expressions Lambda.
- Création d'un nouvel étudiant avec `Supplier`.
- https://github.com/CZ08/JAVA-3A55/tree/main/Prosit%2012

---


### Prérequis
- **JDK** : Version 8 ou supérieure.
- Un IDE comme **IntelliJ IDEA**, **Eclipse** ou **VS Code**.

### Étapes
1. Clonez ce dépôt :  
   ```bash
   git clone https://github.com/CZ08/JAVA-3A55
   cd prosit-gestion

### Auteurs
- Selim Borgi : Etudiant IT.
Pour toute question, contactez-moi à selim.borgi@esprit.tn

