package org.campus02.lv;

import java.util.Arrays;

public class HighscoreDemo {

    public static void main(String[] args) {
        Highscore[] highscores = {
                new Highscore("max", 230.5),
                new Highscore("susi", 530.5),
                new Highscore("john", 430.5),
        };

        Arrays.sort(highscores);
        System.out.println(Arrays.toString(highscores));
    }
}
