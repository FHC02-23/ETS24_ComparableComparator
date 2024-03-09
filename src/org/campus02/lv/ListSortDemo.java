package org.campus02.lv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(2);

        // !!!! Achtung !!!
        // Listen können nicht mit Arrays.sort() sortiert werden
        Collections.sort(integers);
        System.out.println(integers);


        ArrayList<String> names = new ArrayList<>();
        names.add("max");
        names.add("susi");
        names.add("joe");

        Collections.sort(names);
        System.out.println(names);

        ArrayList<Highscore> highscores = new ArrayList<>();
        highscores.add(new Highscore("susi", 30));
        highscores.add(new Highscore("max", 20));
        highscores.add(new Highscore("joe", 50));

        // Task 1:
        // gib die highscores aufsteigend nach name aus
        Collections.sort(highscores);
        System.out.println(highscores);

        // Task 2:
        // gib den highscore absteigend nach score aus

    }
}
