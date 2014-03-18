import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

/**
 * Ever want to be able to store key-value pairs, and be able to store
 * and retrieve them in constant time? Maybe you want to keep track of 
 * people's ages:
 *
 *  "peter"     -> 16
 *  "mary jane" -> 17
 *  "uncle ben" -> 53
 *
 * or any other combination of datatypes, really. One of the most common
 * datastructures for doing this is called a HashMap. Without going into
 * detail, all you need to know is that putting key-value pairs into the
 * hashmap and retrieving values from it are both constant-time operations.
 * In plain-speak, this means that the amount of time it takes to put things
 * in the hashmap and take them out does not depend on how many things
 * are in the hashmap. This is a very desireable property for a datastructure
 * to have, and they're one of the most common datastructures used in
 * problem-solving and job interviews.
 *
 * Javadoc
 * http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
 */
public class HashMapDemo {
    
    public static void main(String[] args) {
        // Define a HashMap
        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        // Put some stuff in it
        ages.put("peter", 16);
        ages.put("mary jane", 17);
        ages.put("uncle ben", 53);

        // Take it out
        System.out.println("Mary Jane is " + ages.get("mary jane") + " years old.");`


        // This is just defining an array of strings with some duplicates
        String[] set = { "peter", "parker", "peter", "mary jane", "parker" };

        // We can see that both the findUnique() methods work, but the difference
        // in running time will be huge when we get to very large datasets
        System.out.println(findUniqueSlow(set).toString());
        System.out.println(findUniqueFast(set).toString());
    }

    /**
     * Uses an O(n^2) algorithm to find all of the unique items in a list.
     * @param  A list to find unique items in
     * @return   A collection representing the unique items in a.
     */
    private static Collection<String> findUniqueSlow(String[] a) {
        // We use an arraylist to hold our output, because we don't
        // know how many unique strings there are.
        ArrayList<String> out = new ArrayList<String>();

        // We go through each item in our original array
        for (int i = 0; i < a.length; i++) {

            // For each one, we need to check if it's aleady in our  output
            // list - if it isn't, we add it
            boolean found = false;
            for (int j = 0; j < out.size(); j++) {
                if (out.get(j).equals(a[i])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                out.add(a[i]);
            }
        }
        return out;
    }

    /**
     * Uses an O(n) algorithm to find all of the unique items in a list.
     * @param  A list to find unique items in
     * @return   A collection representing the unique items in a.
     */
    private static Collection<String> findUniqueFast(String[] a) {
        // Create a new hashmap. We're only really interested in the keys,
        // so we just make the value a boolean
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();

        // We simply go through the list once, and if the key doesn't exist, 
        // we add it to the map
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], true);
            }
        }

        // At the end, we return all of the keys present in the map. While we
        // can't see the implementation of the method, we can assume it
        // takes linear time.
        return map.keySet();
    }
}