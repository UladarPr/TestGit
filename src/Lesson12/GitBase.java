package Lesson12;

public class GitBase {
    static String word1 = "Hello";
    static String word2 = "World!";

    static void sayHello(String word1, String word2) {
        System.out.println( "Method 3 is running: " + word1 + " " + word2);
    }

    public static void main(String[] args) {
        System.out.println("Method 1 is running: " + "Hello World!");
        System.out.println("Method 2 is running: " + word1 + " " + word2);
        sayHello("Hello", "World!");

    }
}
