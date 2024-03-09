package org.campus02.lv;

import java.util.Arrays;

public class ArraysSortDemo {

    public static void main(String[] args) {
        int[] numbers = {4, 3, 7, 8, 10, 1};
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

        char[] chars = {'a', 'c', 'b'};
        Arrays.sort(chars);
        System.out.println(chars);

        double[] doubles = {100.00, 20.22, 11.11, 33.33};
        Arrays.sort(doubles);
        System.out.println(Arrays.toString(doubles));

        String[] animals = {"dog", "cat", "lion", "elephant"};
        System.out.println(Arrays.toString(animals));
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));

        Student[] students = {
                new Student(1, "max", "mustermann"),
                new Student(4, "susi", "sorglos"),
                new Student(3, "john", "doe")
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
