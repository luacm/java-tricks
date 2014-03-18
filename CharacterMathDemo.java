/**
 * In Java, and many other programming languages, a character is a symbol
 * represented by binary encoding. There are many types of character
 * encoding. Java uses UTF-16 which stands for "16-bit Unicode Transformation
 * Format", and it means that Java characters are represented by 16-bit
 * strings. 
 */
public class CharacterMathDemo {
    
    public static void main(String[] args) {
        // Characters in Java are generally enclosed with apostrophes ('').
        // Java can convert the 16-bit string of a character to an integer equivalent.
        int five = '5';
        System.out.println("The character '5' has a decimal value of " + five);

        
        // Because characters have decimal equivalents, we can use the difference
        // between two characters. Here we demonstrate how to find the position of
        // a letter in the alphabet.
        int positionOfG = 'g' - 'a';
        System.out.println("The character 'g' is the " + (positionOfG + 1) + "th letter of the alphabet.");

        // Conversion can go both ways if we type cast an integer as a character.
        // How can you create a your own ascii table using this?
        System.out.println("65 is the decimal value of " + (char)(65));

        // Our own "toUpper" function
        System.out.println("The uppercase of 'a' is " + toUpper('a'));

        // Something a bit trickier
        int n1 = parseInt("1");
        int n2 = parseInt("8675308");
        System.out.println(n1 + n2);
    }

    /**
     * Converts a given lowercase letter to an uppercase letter
     * @param  c The lowercase number you want converted
     * @return   If c was a lowercase letter, it returns the uppercase version. Otherwise,
     *           it just returns c.
     */
    private static char toUpper(char c) {
        // Check for valid input
        if(c >= 'a' && c <= 'z') {
            //Add the difference between the uppercase and lowercase alphabet
            c += 'A' - 'a'; 
        }
        return c;
    }

    /**
     * Converts a string to a base 10 integer
     * @param  s The string you want coverted to a base 10 integer
     * @return   A base 10 integer represeting the given string
     */
    private static int parseInt(String s) {
        int sum = 0;
        int placeValue = 1;

        // Go through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // Extract the decimal value of each character
            int val = s.charAt(i) - '0'; 

            // Add to the sum at the current place value
            sum += val * placeValue;

            // Increase the place value
            placeValue *= 10;
        }
        return sum;
    }
}