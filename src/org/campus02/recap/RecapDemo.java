package org.campus02.recap;

import java.util.Arrays;

public class RecapDemo {

    public static void main(String[] args) {

        int[] numbers = {3,2,5,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = {"max", "susi", "joe", "ferdi"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Apple[] apples = {
                new Apple("red", 20),
                new Apple("yellow", 10),
                new Apple("green", 35)
        };
        Arrays.sort(apples);
        System.out.println(Arrays.toString(apples));
    }
}
