package org.campus02.lv;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSortDemo {


    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5, "max", "mustermann"));
        students.add(new Student(2, "susi", "sorglos"));
        students.add(new Student(6, "susi", "mustermann"));

        students.sort(new StudentsLastFirstNameComporator());
        for (Student student : students) {
            System.out.println(student);
        }


        // ZUR DEMONSTRATION
        // sortieren nach Nachname absteigend
        // anonyme Klasse
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getLastName().compareTo(o1.getLastName());
            }
        });
        System.out.println(students);

        // sortieren nach nachname aufsteigen
        // lambda expression
        students.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println(students);

        // sortieren nach vorname aufsteigend
        students.sort(Comparator.comparing(Student::getFirstName));
        System.out.println(students);

    }
}
