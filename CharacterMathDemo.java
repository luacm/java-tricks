/**
 * In Java, and many other programming languages, a character is a symbol
 * represented by binary encoding. There are many types of character
 * encoding. Java uses UTF-16 which stands for "16-bit Unicode Transformation
 * Format", and it means that Java characters are represented by 16-bit
 * strings.
 *
 * Essentially, that means that every character actually has an underlying
 * decimal value. This can be found in what's called an "ASCII Table." You
 * can see one here: http://www.asciitable.com/
 *
 * You can do lots of neat tricks with that nugget of information, so
 * here are a few of them.
 */
public class CharacterMathDemo {
    
    public static void main(String[] args) {
        // You can grab the ASCII value of any character.
        int a = 'A';
        System.out.println("The ASCII value of 'A' is " + a);

        // Because characters have decimal equivalents, we can use the difference
        // between two characters to find its face value.
        int five = '5' - '0';
        System.out.println("The character '5' has a decimal value of " + five);

        // Here we demonstrate how to find the position of a letter in the alphabet.
        int positionOfG = 'g' - 'a';
        System.out.println("The character 'g' is the " + (positionOfG + 1) + "th letter of the alphabet.");

        // Conversion can go both ways if we type cast an integer as a character.
        // How can you create a your own ascii table using this?
        System.out.println("65 is the ASCII value of " + (char)(65));

        // Our own "toUpper" function
        System.out.println("The uppercase of 'a' is " + toUpper('a'));

        // Something a bit trickier. We can actually make our own version
        // of Integer.parseInt()
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