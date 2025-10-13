# 1.2.10-MadLibs
This project is a simple Mad Libs game written in Java. The program prompts the user to enter different types of words (nouns, verbs, adjectives) and then generates a funny and creative story using the user's input

Prompts the user for multiple word types:
- Nouns
- Adjectives
- Verbs

Dynamically generates a story based on user input.

## Approach and Implementation
- **Main Method:**  
  The `main` method drives the program, prompting the user and assembling the story.

- **CamelCase Usage:**  
  All variable and method names use camelCase as per Java conventions and AP guidelines.

- **Comments:**  
  Each method is documented with comments explaining its role in the algorithm.

### Mad Lib Algorithm

1. **Template:**  
   There is a fixed story structure with placeholders for user-provided nouns, adjectives, and verbs.

2. **User Input and Suggestions:**  
   - Before each input, the user is prompted for a specific part of speech (noun, adjective, verb).
   - Each prompt provides a random suggestion chosen from a predefined array.

3. **String Methods:**  
   - `nextLine()`, array indexing, string concatenation

4. **Parsing and Replacement:**  
   - The story is created by concatenating the user inputs in the correct order.
   - Only basic string operations were used to implment this

5. **User Experience:**  
   - Clear prompts and suggestions keep the user on track.
   - When all words are entered, the final story is printed to the console.
     
## Screenshots
<img width="1274" height="183" alt="image" src="https://github.com/user-attachments/assets/5dd4c1c1-517f-4329-ab07-5a10aae87dd0" />

  
