package tn.esprit.prosit.interfaces;

import tn.esprit.prosit.entities.Etudiant;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.Comparator;

public interface Management {
    void displayStudents(List<Etudiant> students, Consumer<Etudiant> con);
    void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con);
    String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun);
    Etudiant createStudent(Supplier<Etudiant> sup);
    List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com);
    Stream<Etudiant> convertToStream(List<Etudiant> students);
}
