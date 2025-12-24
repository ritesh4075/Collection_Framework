package collections.set.enumset;

import java.util.EnumSet;

public class EnumSet_Operations {
    public static void main(String[] args) {

        EnumSet<Day> a = EnumSet.of(Day.MON, Day.TUE, Day.WED);
        EnumSet<Day> b = EnumSet.of(Day.WED, Day.THU, Day.FRI);

        // Union
        EnumSet<Day> union = EnumSet.copyOf(a);
        union.addAll(b);
        System.out.println(union);

        // Intersection
        EnumSet<Day> intersection = EnumSet.copyOf(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // Difference
        EnumSet<Day> diff = EnumSet.copyOf(a);
        diff.removeAll(b);
        System.out.println(diff);
    }
}

