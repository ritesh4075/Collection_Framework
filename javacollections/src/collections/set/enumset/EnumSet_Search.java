package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Search {
    public static void main(String[] args) {

        // Creating EnumSet
        EnumSet<Day> set = EnumSet.of(Day.MON, Day.WED);

        // Checking existence
        System.out.println(set.contains(Day.MON));
        System.out.println(set.contains(Day.FRI));
    }
}

