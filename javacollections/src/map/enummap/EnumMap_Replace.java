package map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Replace {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MON, "Work");

        map.replace(Day.MON, "Office");
        map.replace(Day.MON, "Office", "Remote");

        System.out.println(map);
    }
}

