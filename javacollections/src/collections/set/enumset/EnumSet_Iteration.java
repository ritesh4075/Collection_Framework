package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Iteration {
    public static void main(String[] args) {

        // Creating EnumSet
        EnumSet<Day> set = EnumSet.of(Day.WED, Day.MON, Day.FRI);

        // Iterates in enum order, not insertion order
        for (Day d : set) {
            System.out.print(d + " ");
        }
    }
}

