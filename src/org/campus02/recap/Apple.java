package org.campus02.recap;

import java.util.Objects;

public class Apple implements Comparable<Apple> {

    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Apple setColor(String color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Apple setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Apple o) {
        // Sortierung aufsteigend nach gewicht
        //return Integer.compare(this.weight, o.weight);

        // Sortierung aufsteigend nach Farbe (color)
        return this.color.compareTo(o.color);
    }
}
