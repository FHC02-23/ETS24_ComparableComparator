package org.campus02.lv;

public class Student implements Comparable<Student> {

    private int matrNr;
    private String firstName;
    private String lastName;

    public Student(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public Student setMatrNr(int matrNr) {
        this.matrNr = matrNr;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
//        if (this.matrNr < other.matrNr) {
//            return -1;
//        }
//        if (this.matrNr > other.matrNr) {
//            return 1;
//        }
//        return 0;

        return Integer.compare(other.matrNr, this.matrNr);
    }
}
