import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class CreatingCompartors {

    public static void main(String[] args) {

        List<String> strings =
                Arrays.asList("one", "two", "three", "four", "five",
                        "six", "seven", "eight", "nine");

        Comparator<String> cmp =
                Comparator.naturalOrder();
        strings.sort(cmp);
        System.out.println(strings);

        ToIntFunction<String> toLength = s -> s.length();

        Comparator<String> cmp2 = Comparator.comparingInt(toLength);

        strings.sort(cmp2);
        System.out.println(strings);
    }
}
