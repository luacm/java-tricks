import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

public class HashMapDemo {
    
    public static void main(String[] args) {
        String[] set = { "peter", "parker", "peter", "mary jane", "parker" };

        System.out.println(findUniqueSlow(set).toString());
        System.out.println(findUniqueFast(set).toString());
    }

    private static Collection<String> findUniqueSlow(String[] a) {
        ArrayList<String> out = new ArrayList<String>();
        for (int i = 0; i < a.length; i++) {
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

    private static Collection<String> findUniqueFast(String[] a) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], true);
            }
        }
        return map.keySet();
    }
}