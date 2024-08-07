package Collections.Ejemplos.list;

import Collections.Ejemplos.modelo.Alumno;

import java.util.*;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Platon", 1));
        sa.add(new Alumno("Cristian", 8));
        sa.add(new Alumno("Cintia", 6));
        sa.add(new Alumno("Emanuel", 9));
        sa.add(new Alumno("Anahi", 3));
        sa.add(new Alumno("Platon", 8));
        sa.add(new Alumno("Ricardo", 7));
        sa.add(new Alumno("Platon", 1));
        Collections.sort(sa, comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        System.out.println("Iterando con Stream forEach");
        sa.forEach(System.out::println);
    }
}
