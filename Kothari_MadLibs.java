import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    private static final Random random = new Random();

    //Lists of suggestions for each word type
    static final String[] nounSuggestions = {"dog", "castle", "programmer", "taco", "mountain", "robot"};
    static final String[] adjectiveSuggestions = {"fluffy", "gigantic", "sparkling", "sleepy", "electric", "brave"};
    static final String[] verbSuggestions = {"run", "sing", "teleport", "giggle", "invent", "dance"};

    public static String getRandomSuggestion(String[] suggestions) {
        //Using the random object to generate a random index and return a suggestion from the array
        int randomIndex = random.nextInt(suggestions.length);
        return suggestions[randomIndex];
    }

    public static String getUserInput(Scanner scanner, String wordType, String[] suggestions) {
        //Getting input from the user and also generating a random suggestion for the word
        String suggestion = getRandomSuggestion(suggestions);
        System.out.print("Enter a " + wordType + " (e.g., " + suggestion + "): ");
        return scanner.nextLine();
    }

    public static String generateStory(String noun1, String adjective1, String verb1,
                                       String noun2, String adjective2, String verb2, String noun3) {
        //Concatenating user inputs into the story
        String story = "Once upon a time, there was a " + adjective1 + " " + noun1 +
                        " who loved to " + verb1 + ". One day, it found a " + adjective2 + " " + noun2 +
                        " that could " + verb2 + ". Together, they became best friends and traveled to the land of " +
                        noun3 + " to live happily ever after.";
        return story;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words to make a story");

        //Calling all of the functions to get the user inputs and generate the story
        String noun1 = getUserInput(scanner, "noun", nounSuggestions);
        String adjective1 = getUserInput(scanner, "adjective", adjectiveSuggestions);
        String verb1 = getUserInput(scanner, "verb", verbSuggestions);
        String noun2 = getUserInput(scanner, "noun", nounSuggestions);
        String adjective2 = getUserInput(scanner, "adjective", adjectiveSuggestions);
        String verb2 = getUserInput(scanner, "verb", verbSuggestions);
        String noun3 = getUserInput(scanner, "noun", nounSuggestions);

        System.out.println("Your Story");
        String story = generateStory(noun1, adjective1, verb1, noun2, adjective2, verb2, noun3);
        System.out.println(story);

        scanner.close();
    }
}
