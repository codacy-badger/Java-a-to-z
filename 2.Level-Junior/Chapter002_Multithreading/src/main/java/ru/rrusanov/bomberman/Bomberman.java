package ru.rrusanov.bomberman;
/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 4.10.2018
 *
 * Main enter point.
 */
public class Bomberman {
    /**
     * Main point program to enter.
     * @param args console arguments.
     */
    public static void main(String[] args) {
        new Thread(new Board()).start();
    }
}
