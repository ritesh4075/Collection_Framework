package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Complement {
    public static void main(String[] args) {

        EnumSet<Day> working = EnumSet.range(Day.MON, Day.FRI);

        // All days except working days
        EnumSet<Day> weekend = EnumSet.complementOf(working);

        System.out.println(weekend);
    }
}

