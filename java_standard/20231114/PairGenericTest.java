package course.part2;

import model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello",1);
        System.out.println(pair.getKey()); // hello
        System.out.println(pair.getValue()); // 1

        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor", 60);
        maps.put("eng", 65);
        maps.put("math", 70);

        System.out.println(maps.get("kor")); // 60
        System.out.println(maps.get("eng")); // 65
        System.out.println(maps.get("math")); // 70
    }

}
