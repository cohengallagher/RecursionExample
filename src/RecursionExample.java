public class RecursionExample {
    public static void main(String[] args) {
        String input = "Recursion is awesome!";
        int vowelCount = countVowels(input.toLowerCase());
        System.out.println("Number of vowels: " + vowelCount);
    }

    /**
     * Recursively counts vowels in a string.
     *
     * @param str The string to check
     * @return The number of vowels in the string
     */
    public static int countVowels(String str) {
        // Base case: if string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Check if the first character is a vowel
        char first = str.charAt(0);
        int count = (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') ? 1 : 0;

        // Recursive step: count vowels in the rest of the string
        return count + countVowels(str.substring(1));
    }
}