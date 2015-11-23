
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        showUsage();
        while (true) {
            String command = getCommand();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                addWord();
            } else if (command.equals("translate")) {
                translateWord();
            } else {
                System.out.println("Unknown statement");
            }
        }
        System.out.println("Cheers!");
    }

    private String getCommand() {
        System.out.print("Statement: ");
        return reader.nextLine();
    }

    private void showUsage() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println("");
    }

    private void addWord() {
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }

    private void translateWord() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }

}
