package org.campus02.lv;

public class Highscore implements Comparable<Highscore> {

    private String name;
    private double score;

    // ALT + Einfg
    public Highscore(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // GETTER SETTER
    // ALT + Einfg
    public String getName() {
        return name;
    }

    public Highscore setName(String name) {
        this.name = name;
        return this;
    }

    public double getScore() {
        return score;
    }

    public Highscore setScore(double score) {
        this.score = score;
        return this;
    }

    // ALT + Einfg
    @Override
    public String toString() {
        return "Highscore{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * sortiere nach namen
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Highscore o) {
        return this.name.compareTo(o.name);
    }

    /**
     * Absteigend sortieren nach score
     *
     * @param o the object to be compared.
     * @return
     */
//    @Override
//    public int compareTo(Highscore o) {
//        if (this.score < o.score) {
//            return 1;
//        }
//        if (this.score > o.score) {
//            return -1;
//        }
//        return 0;
//    }
}
