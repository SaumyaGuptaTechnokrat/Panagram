import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = pangramChecker(input.toLowerCase()); // Convert to lowercase for case-insensitivity
        //The quick brown fox jumps over the lazy dog
        //Input sentence example
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
    public static boolean pangramChecker(String input) {
        Set<Character> setOfAlphabet = new HashSet<>();
        
        // Add all alphabets from 'a' to 'z' to the set
        for (char ch = 'a'; ch <= 'z'; ch++) {
            setOfAlphabet.add(ch);
        }
        
        // Iterate through the input characters and remove them from the set
        for (char ch : input.toCharArray()) {
            setOfAlphabet.remove(ch);
        }
        
        // If the set is empty, it's a pangram
        return setOfAlphabet.isEmpty();
    }
}
