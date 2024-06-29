import java.util.*;

public class HashCollisionChecker {
    public static <T> int countOfUniqueHashCodes(HashSet<T> set) {
        // TODO: Implement
        Set<T> newSet = new HashSet<>();
        Set<Integer> hashCodeCollector = new HashSet<>();
        Iterator<T> it = set.iterator();
        while ( it.hasNext() ) {
            newSet.add(it.next());
            hashCodeCollector.add(newSet.hashCode());
            newSet.clear();
        }
        return hashCodeCollector.size();
    }

    public static <K, V> int countOfUniqueHashCodes(HashMap<K, V> map) {
        // TODO: Implement
        Set<K> set = new HashSet<>();
        Set<Integer> hashCodeCollector = new HashSet<>();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            set.add(it.next());
            hashCodeCollector.add(set.hashCode());
            set.clear();
        }
        return hashCodeCollector.size();
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