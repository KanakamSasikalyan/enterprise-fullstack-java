import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Naruto");
        map.put(4, "Death Note");
        map.put(6, "Slayer");
        map.put(6, "Hells Paradise");

        System.out.println("Map: "+ map);

        //remove key from the map
        map.remove(6);
        System.out.println("after 6 removal: "+ map);

        Set set = map.entrySet();
        System.out.println("entry set: "+ set);

        for(Map.Entry p : map.entrySet()){
            System.out.println("Key: "+ p.getKey()+" Value: "+ p.getValue());
        }

        //containsKey
        System.out.println("Map contains 4: ?"+ map.containsKey(1));

        //containsValue
        System.out.println("Map contains Naruto? "+ map.containsValue("Naruto"));

        //replace method in hashset
        map.replace(1, "Attack On Titan");

        System.out.println("after replace: "+ map);

    }
}
