package map.enummap;
import java.util.EnumMap;
import java.util.Map;

public class EnumMap_Get {
    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MON, "Work");
        map.put(Day.TUE, "Gym");

        // Get value
        System.out.println(map.get(Day.MON));

        // Get default value if key missing
        System.out.println(map.getOrDefault(Day.FRI, "Free"));
    }
}
