import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;

public class HashCollisionChecker {

    public static <T> int countOfUniqueHashCodes(HashSet<T> set) {
        Set<Integer> uniqueHashCodes = new HashSet<>();
        for (T element : set) {
            uniqueHashCodes.add(element.hashCode());
        }
        return uniqueHashCodes.size();
    }

    public static <K, V> int countOfUniqueHashCodes(HashMap<K, V> map) {
        Set<Integer> uniqueHashCodes = new HashSet<>();
        for (K key : map.keySet()) {
            uniqueHashCodes.add(key.hashCode());
        }
        return uniqueHashCodes.size();
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("c#c#c#c#c#c#bBc#c#c#c#bBc#");
        set.add("abcd");
        set.add("c#c#c#c#c#c#bBc#c#c#c#c#aa");
        set.add("1234");
        set.add("c#c#c#c#c#c#bBc#c#c#c#c#bB");
        System.out.println(countOfUniqueHashCodes(set)); // 3

        HashMap<String, Integer> map = new HashMap<>();
        map.put("c#c#c#c#c#c#c#aaaaaaaabBbB", 14);
        map.put("c#c#c#c#c#c#c#aaaaaaaac#c#", 12);
        map.put("c#c#c#c#c#c#c#aaaaaaaac#cc", 16);
        System.out.println(countOfUniqueHashCodes(map)); // 2
    }
}
