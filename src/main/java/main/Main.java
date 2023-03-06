package main;
/**
 * @author Dima Kohol
 * @version jdk 11.0.2
 * */

/**
 * Main class for show us string and after delay on 0.5s show new string.
 * @see main.Main
 * */
public class Main {
    /**
     * params args
     * throws InterruptedException
     * return void
     * */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        Thread.sleep(500);
        System.out.println("Tester!");
    }
}
