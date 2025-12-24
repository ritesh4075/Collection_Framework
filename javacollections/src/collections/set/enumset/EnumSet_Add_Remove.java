package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Add_Remove {
    public static void main(String[] args) {

        // Creating EnumSet
        EnumSet<Day> set = EnumSet.of(Day.MON, Day.TUE);

        // Adding elements
        set.add(Day.WED);

        // Removing element
        set.remove(Day.TUE);

        System.out.println(set);

        // Removing all
        set.clear();

        System.out.println(set);
    }
}

