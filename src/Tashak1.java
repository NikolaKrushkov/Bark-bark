import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tashak1 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<>();

    public void displayMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new word to the list");
            System.out.println("2. Print all words from the list");
            System.out.println("3. Check if a word is in the list");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addWord();
                case 2 -> printWords();
                case 3 -> checkWord();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
 //
    public void addWord() {
        System.out.println("Enter the word to add:");
        String word = scanner.nextLine();
        words.add(word);
        System.out.println("Word added successfully.");
    }

    public void printWords() {
        System.out.println("Words in the list:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void checkWord() {
        System.out.println("Enter the word to check:");
        String word = scanner.nextLine();
        if (words.contains(word)) {
            System.out.println(word + " is in the list.");
        } else {
            System.out.println(word + " is not in the list.");
        }
    }

    public static void main(String[] args) {
        Tashak1 tashak = new Tashak1();
        tashak.displayMenu();
    }
}
