package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Compute {
    public static void main(String[] args) {

        Map<Day, Integer> map = new EnumMap<>(Day.class);

        map.computeIfAbsent(Day.MON, k -> 8);
        map.computeIfPresent(Day.MON, (k, v) -> v + 1);
        map.merge(Day.MON, 2, Integer::sum);

        System.out.println(map);
    }
}

