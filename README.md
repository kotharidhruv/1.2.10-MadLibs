# 1.2.10-MadLibs
This project is a simple Mad Libs game written in Java. The program prompts the user to enter different types of words (nouns, verbs, adjectives) and then generates a funny and creative story using the user's input

Prompts the user for multiple word types:
- Nouns
- Adjectives
- Verbs

Dynamically generates a story based on user input.

## Approach / Methodology

1. Input Handling
- A dedicated method getUserInput is used to prompt the user and collect input.
- This ensures code is reusable and clean.

2. Story Generation
- generateStory method constructs the story using string concatenation.=
- Each word entered by the user is inserted into a predefined story template.
- 
3. Program Flow
- The main method orchestrates the program:
- Prompt user for 7 words (3 nouns, 2 adjectives, 2 verbs)
- Pass words to generateStory
- Display the completed story

4. Design Considerations
- Simplicity: Easy-to-read code structure for beginners.
- Reusability: Methods for input and story generation can be extended for multiple stories.
- User Experience: Clear prompts for each type of word.
