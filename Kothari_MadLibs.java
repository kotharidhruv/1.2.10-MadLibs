import java.util.Scanner;

public class MadLibs {

    public static String getUserInput(Scanner scanner, String wordType) {
        System.out.print("Enter a " + wordType + ": ");
        return scanner.nextLine();
    }

    public static String generateStory(String noun1, String adjective1, String verb1,
                                       String noun2, String adjective2, String verb2, String noun3) {
        String story = "Once upon a time, there was a " + adjective1 + " " + noun1 +
                       " who loved to " + verb1 + ". One day, it found a " + adjective2 + " " + noun2 +
                       " that could " + verb2 + ". Together, they became best friends and traveled to the land of " +
                       noun3 + " to live happily ever after.";
        return story;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String noun1 = getUserInput(scanner, "noun");
        String adjective1 = getUserInput(scanner, "adjective");
        String verb1 = getUserInput(scanner, "verb");
        String noun2 = getUserInput(scanner, "noun");
        String adjective2 = getUserInput(scanner, "adjective");
        String verb2 = getUserInput(scanner, "verb");
        String noun3 = getUserInput(scanner, "noun");

        String story = generateStory(noun1, adjective1, verb1, noun2, adjective2, verb2, noun3);
        System.out.println(story);

        scanner.close();
    }
}
