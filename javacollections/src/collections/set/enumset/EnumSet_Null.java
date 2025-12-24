package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Null {
    public static void main(String[] args) {

        EnumSet<Day> set = EnumSet.noneOf(Day.class);

        // This will throw NullPointerException
        set.add(null);
    }
}

