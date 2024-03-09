package org.campus02.employee;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String name;
    private double salary;
    private String department;


    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public Employee setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.empNumber < o.empNumber) {
//            return -1;
//        }
//        if (this.empNumber > o.empNumber) {
//            return 1;
//        }
//        return 0;

        return Integer.compare(this.empNumber, o.empNumber);
    }
}
