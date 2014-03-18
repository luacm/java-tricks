import java.util.Arrays;

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

        // We can make a handy function that will find 
        String s = "Hey buddy I'm just trying to find Spider-Man ok?";
        int index = findIndex(s, "Spider-Man");

        System.out.println(index);
    }

    private static int findIndex(String s, String target) {
        String[] tokens = s.split("\\s");
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(target))
                return i;
        }
        return -1;
    }
}