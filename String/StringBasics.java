// This is a simple Java program that demonstrates common String methods.
class StringBasics {

    // main() method — the entry point of every Java program
    public static void main(String[] args) {
        
        // Create and initialize a String variable with extra spaces
        String text = "Java Programming";

        // Prints the original string as it is
        System.out.println("Original: " + text);

        // Removes extra spaces from the beginning and end of the string
        System.out.println("Trimmed: " + text.trim());

        // Returns the total number of characters (including spaces)
        System.out.println("Length: " + text.length());

        // Converts all letters in the string to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Checks if the string contains the word "Java" (case-sensitive)
        System.out.println("Contains 'Java'? " + text.contains("Java"));

        // Returns the character present at index 5 (counting starts from 0)
        System.out.println("Character at index 5: " + text.charAt(5));

        // Extracts a substring (portion of text) from index 2 to 5 (end index is excluded)
        System.out.println("Substring(2,6): " + text.substring(2, 6));

        // Replaces all occurrences of the character 'a' with 'o'
        System.out.println("Replace 'a' with 'o': " + text.replace('a', 'o'));
    }
}
 