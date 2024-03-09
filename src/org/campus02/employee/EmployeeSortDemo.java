package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(5, "max", 3_000, "Development"),
                new Employee(2, "max", 3_000, "Research"),
                new Employee(4, "susi", 18_000, "Sales"),
                new Employee(1, "joe", 2_500, "Marketing")
        };

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
