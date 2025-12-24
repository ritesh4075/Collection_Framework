package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Create {
    public static void main(String[] args) {

        // Empty set of enum type
        EnumSet<Day> empty = EnumSet.noneOf(Day.class);

        // All enum constants
        EnumSet<Day> all = EnumSet.allOf(Day.class);

        // Specific values
        EnumSet<Day> some = EnumSet.of(Day.MON, Day.WED, Day.FRI);

        // Range (based on enum order)
        EnumSet<Day> range = EnumSet.range(Day.MON, Day.THU);

        System.out.println(empty);
        System.out.println(all);
        System.out.println(some);
        System.out.println(range);
    }
}

