import java.util.Arrays;

/**
 * String.split() is a really useful method. It lets you take a String and
 * turn it into an array of Strings, broken apart based on a certain 
 * separator. The separator takes the form of something called a 
 * "Regular Expression." It's basically a special syntax to define a pattern.
 * Don't worry about it too much, though. Here are some common separators:
 *
 * Spaces (' '):  "\\s"
 * Commas (','):  ","
 * Pipes ('|'):   "\\|"
 *
 * So after you call the split() method, you then have an array of tokens
 * you can loop through to do whatever you please with.
 */
public class SplitDemo {
    
    public static void main(String[] args) {
        // Split up a string based on spaces
        String spaceString = "I really like Spider-Man";
        String[] spaceTokens = spaceString.split("\\s");
        System.out.println(Arrays.toString(spaceTokens));

        // Split up a string based on pipes
        String commaString = "Venom,Green Goblin,Vulture,Doctor Octopus";
        String[] commaTokens = commaString.split(",");
        System.out.println(Arrays.toString(commaTokens));

        // We can make a handy function that will find the index of a certain token
        String s = "Hey buddy I'm just trying to find Spider-Man ok?";
        int index = findIndex(s, "Spider-Man");

        System.out.println(index);
    }

    /**
     * Given a string and a target, this will find the index of
     * the matching token. The string is tokenized based on spaces.
     * @param  s      The string you're searching through
     * @param  target The string you're searching for
     * @return        The index of the token if a match is found,
     *                otherwise -1.
     */
    private static int findIndex(String s, String target) {
        String[] tokens = s.split("\\s");
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(target))
                return i;
        }
        return -1;
    }
}