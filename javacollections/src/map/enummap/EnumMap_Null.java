package map.enummap;

import java.util.EnumMap;

public class EnumMap_Null {
    public static void main(String[] args) {

        EnumMap<Day, String> map = new EnumMap<>(Day.class);

        // This throws NullPointerException
        map.put(null, "Invalid");
    }
}

