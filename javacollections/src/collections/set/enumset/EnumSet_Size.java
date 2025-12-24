package collections.set.enumset;
import java.util.EnumSet;

public class EnumSet_Size {
    public static void main(String[] args) {

        // Creating empty EnumSet
        EnumSet<Day> set = EnumSet.noneOf(Day.class);

        // Checking empty
        System.out.println(set.isEmpty());

        set.add(Day.MON);
        set.add(Day.TUE);

        // Number of elements
        System.out.println(set.size());
    }
}

