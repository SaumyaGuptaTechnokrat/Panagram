import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = pangramChecker(input.toLowerCase()); // Convert to lowercase for case-insensitivity

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean pangramChecker(String input) {
        boolean[] alphabetPresent = new boolean[26]; // 26 letters in the English alphabet

        // Iterate through the input characters and mark their presence
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
