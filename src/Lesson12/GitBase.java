package Lesson12;

public class GitBase {
    static String word1 = "Hello";
    static String word2 = "World!";

    static void sayHello(String word1, String word2) {
        System.out.println(word1 + " " + word2);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(word1 + word2);
        sayHello("Hello", "World!");

    }
}
